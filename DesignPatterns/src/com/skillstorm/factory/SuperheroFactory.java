package com.skillstorm.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * This is a factory that returns an available superhero
 */

public class SuperheroFactory {

    List<Superhero> heroes;

    public SuperheroFactory(List<Superhero> heroes) {
        this.heroes = new ArrayList<>(heroes);
    }

    public Superhero getSuperhero() throws SuperheroException {
        for (Superhero hero : heroes) {
            if (hero.isAvailable()) {
                hero.setAvailable(false);
                return hero;
            } else {

                throw new SuperheroException("Sorry, no superheroes are available to save the day.");
            }
        }
        return null;
    }

    void successfulReturn(Superhero hero) {
        hero.setAvailable(true);
    }
}
