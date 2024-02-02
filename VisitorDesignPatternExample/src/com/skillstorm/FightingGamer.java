package com.skillstorm;

public class FightingGamer extends Gamer {

    public FightingGamer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
