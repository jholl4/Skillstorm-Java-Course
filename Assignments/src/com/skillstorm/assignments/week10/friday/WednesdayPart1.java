package com.skillstorm.assignments.week10.friday;

import java.util.HashMap;

public class WednesdayPart1 {

    private static HashMap<String, String> alphabet;

    static {
        // initialize and fill
        alphabet = new HashMap<>();
        alphabet.put("A", "Alpha");
        alphabet.put("B", "Bravo");
        alphabet.put("C", "Charlie");
        alphabet.put("D", "Delta");
        alphabet.put("E", "Echo");
        alphabet.put("F", "Foxtrot");
        alphabet.put("G", "Golf");
        alphabet.put("H", "Hotel");
        alphabet.put("I", "India");
        alphabet.put("J", "Juliett");
        alphabet.put("K", "Kilo");
        alphabet.put("L", "Lima");
        alphabet.put("M", "Mike");
        alphabet.put("N", "November");
        alphabet.put("O", "Oscar");
        alphabet.put("P", "Papa");
        alphabet.put("Q", "Quebec");
        alphabet.put("R", "Romeo");
        alphabet.put("S", "Sierra");
        alphabet.put("T", "Tango");
        alphabet.put("U", "Uniform");
        alphabet.put("V", "Victor");
        alphabet.put("W", "Whiskey");
        alphabet.put("X", "X-ray");
        alphabet.put("Y", "Yankee");
        alphabet.put("Z", "Zulu");
    }

    public static String spellName(String name) {
        if (name.length() < 1) {
            return "";
        }
        String phon = phoneticFormat(name.substring(0, 1));
        String restOfTheName = spellName(name.substring(1, name.length()));

        return phon + restOfTheName;
    }

    public static String phoneticFormat(String letter) {
        return String.format("%s as in %s\n", letter.toUpperCase(), alphabet.get(letter.toUpperCase()));
    }

    public static void main(String[] args) {
        System.out.println(spellName("Amy"));
        System.out.println(spellName("Josh"));
        System.out.println(spellName("sPoNgEbOb"));
    }

}
