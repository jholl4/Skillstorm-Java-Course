package com.skillstorm;

public class RPGGamer extends Gamer {

    public RPGGamer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
