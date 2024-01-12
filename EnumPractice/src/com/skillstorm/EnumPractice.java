package com.skillstorm;

public class EnumPractice {

    public static void main(String[] args) {

        // FellowshipMembers member = FellowshipMembers.GIMLI;

        // if(member == FellowshipMembers.GIMLI){
        // System.out.println("AND MY AXE!!!");
        // }

        // for (FellowshipMembers member : FellowshipMembers.values()) {

        // }
        FellowshipMembers member = FellowshipMembers.GIMLI;

        switch (member.WEAPON) {
            case "Axe":
                System.out.println("Chop!");
                break;
            case "Dagger":
                System.out.println("Poke!");
                break;
            case "Staff":
                System.out.println("Lightning!");
                break;
            default:
                System.out.println("Swing!");
        }

    }

    // public static void printEnumValues(Enum input) {
    // for (input value : input.values()) {
    // System.out.println(value);
    // }
    // }

}
