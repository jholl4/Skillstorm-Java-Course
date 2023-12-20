package day3.generics;

public class Printer<T extends Animal> {

    T thingToPrint; // T allows us to print any type (Integer, Double, String)

    // constructor that takes in thingToPrint of type T
    public Printer(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(thingToPrint);
        thingToPrint.speak();
    }

}
