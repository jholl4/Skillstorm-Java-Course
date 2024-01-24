package com.skillstorm.immutables;

import java.util.Arrays;
import java.util.List;

public class TestRosettaStone {

    public static void main(String[] args) {

        RosettaStone stone = new RosettaStone("Hello! Hola!",
                Arrays.asList(new Language("English"), new Language("Spanish")));
        System.out.println(stone.getText());

        List<Language> langCopy = stone.getLanguages();
        System.out.println(langCopy);
    }

}
