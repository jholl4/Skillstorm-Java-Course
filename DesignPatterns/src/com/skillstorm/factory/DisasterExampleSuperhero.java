package com.skillstorm.factory;

import java.util.List;

public class DisasterExampleSuperhero {

    public static void main(String[] args) {
        System.out.println("Help! The bridge is collapsing!");

        List<Superhero> DCHeroes = 
        SuperheroFactory heroFactory = new SuperheroFactory();
        // ask factory for a superhero
        try {
            Superhero hero = heroFactory.getSuperhero();
        } catch (SuperheroException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Don't worry");
    }

}
