package com.skillstorm;

public class Emailer implements Visitor {

    @Override
    public void visit(RPGGamer gamer) {
        System.out.println("Emailing RPG gamer " + gamer.name + " about our super cool new RPG");
    }

    @Override
    public void visit(FightingGamer gamer) {
        System.out.println("Emailing Fighting gamer " + gamer.name + " about our super cool new fighting game");
    }

}
