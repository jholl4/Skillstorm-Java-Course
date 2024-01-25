package com.skillstorm.observer;

public class PrintSubscriber implements Observer {

    @Override
    public void update(Object o) {
        System.out.println(o);
    }

    @Override
    public String toString() {
        return "PrintSubscriber []";
    }

}
