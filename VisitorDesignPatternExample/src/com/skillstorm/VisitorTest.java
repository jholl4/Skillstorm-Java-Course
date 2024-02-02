package com.skillstorm;

import java.util.ArrayList;
import java.util.List;

public class VisitorTest {

    public static void main(String[] args) {
        List<Gamer> customerList = new ArrayList<>();

        Gamer rpgGamer = new RPGGamer("Susie", "susie99@email.com");
        Gamer fightingGamer = new FightingGamer("Jimmy", "jimmytron@email.com");

        customerList.add(fightingGamer);
        customerList.add(rpgGamer);

        Emailer emailer = new Emailer();

        for (Gamer gamer : customerList) {
            gamer.accept(emailer);
        }

    }

}


