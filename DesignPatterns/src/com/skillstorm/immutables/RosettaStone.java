package com.skillstorm.immutables;

import java.util.ArrayList;
import java.util.List;

/*
 * This class is immutable. Once it is created it's state cannot be changed.
 * 
 */

public final class RosettaStone {

    private String text;
    private final List<Language> languages;

    public RosettaStone(String text, List<Language> languages) {
        this.text = text;
        this.languages = copyLanguages(languages);
    }

    public List<Language> getLanguages() {
        List<Language> languages = new ArrayList<>();
        for (Language lang : this.languages) {
            languages.add(new Language(lang.getName()));
        }
        return languages;
    }

    public String getText() {
        return text;
    }

    private List<Language> copyLanguages(List<Language> list) {
        List<Language> copy = new ArrayList<>();
        for (Language lang : list) {
            copy.add(new Language(lang.getName()));
        }
        return copy;
    }

}
