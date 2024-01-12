package com.skillstorm;

public enum FellowshipMembers {
    GANDALF("Staff"),
    FRODO("Short sword"),
    SAM("Dagger"),
    MERRY("Dagger"),
    PIPPIN("Dagger"),
    ARAGORN("Long Sword"),
    BOROMIR("Long Sword"),
    LEGOLAS("Bow"),
    GIMLI("Axe");

    final String WEAPON;

    FellowshipMembers(String WEAPON) {
        this.WEAPON = WEAPON;
    }

}
