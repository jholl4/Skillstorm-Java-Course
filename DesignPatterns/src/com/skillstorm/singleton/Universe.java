package com.skillstorm.singleton;

/*
 * Universe is a singleton. There should only be one instance created.
 */

public class Universe {

    int age = 0;
    private static final Universe instance = new Universe();

    private Universe() {

    }

    public static Universe getInstance() {
        return instance;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
