package com.skillstorm.observer;

public class DigitalSubscriber implements Observer {

    @Override
    public void update(Object o) {
        System.out.println(o);
    }

    @Override
    public String toString() {
        return "DigitalSubscriber []";
    }

}
