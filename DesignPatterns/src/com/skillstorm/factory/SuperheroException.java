package com.skillstorm.factory;

public class SuperheroException extends Exception {

    String message;

    public SuperheroException() {
    }

    public SuperheroException(String message) {
        super();
        this.message = message;
    }

}
