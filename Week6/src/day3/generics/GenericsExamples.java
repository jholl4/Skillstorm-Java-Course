package day3.generics;

import java.util.ArrayList;
import java.util.List;

/*
 * Generics
 *  - allow for code reusability
 *  - use angle brackets <T>
 *  - do not use primitive data types
 *      - must use wrapper class
 *  - eliminate the need to cast your data types
 * 
 * Bounded Generics
 *  - gives your bound a limit on what types can be passed in
 *  - can extend classes
 *      Printer <T extends Animal>
 * 
 *  - can implement interfaces, must still use extends keyword
 *      Printer <T extends Interface>
 * 
 *  - can extend a class and multiple interfaces at the same time; class must be first
 *      - restrictions:
 *          - can only extend 1 class because java doesn't support multiple inheritance
 *          - must give class name first and any interfaces after class
 *      Printer <T extends Animal & Interface1 & Interface2>
 * 
 * Generic Methods
 *  - use angle brackets before method return type
 *  - Generic method can be created in regular classes - don't need to be generic
 *  - can take multiple parameters
 * 
 * Wildcards
 *  - Used when the type is unknown
 *      <?>
 * 
 */

public class GenericsExamples {

    public static void main(String[] args) {

        /*
         * uses individual classes - redundant
         */
        IntegerPrinter printer = new IntegerPrinter(16);
        printer.print();

        DoublePrinter doublePrinter = new DoublePrinter(10.0);
        doublePrinter.print();

        StringPrinter sPrinter = new StringPrinter("Heeeeeeey!");
        sPrinter.print();

        /*
         * uses generic Printer class
         */
        // Printer<Integer> genericIntegerPrinter = new Printer<>(34);
        // genericIntegerPrinter.print();

        // Printer<Double> genericDoublePrinter = new Printer<>(11.11);
        // genericDoublePrinter.print();

        // Printer<String> genericStringPrinter = new Printer<>("AYYOOOO!");
        // genericStringPrinter.print();

        Printer<Dog> dogPrinter = new Printer<>(new Dog("Fido"));
        dogPrinter.print();

        System.out.println("Testing generic method shout:");
        shout(13, 11.1);
        shout("Caroline", "Erica");
        shout(new Dog("Charlie"), new Dog("Moose"));
        shout("test string", new Dog("Moose"));

        List<Integer> intList = new ArrayList<>();
        intList.add(7);
        intList.add(2);
        intList.add(1);

        printList(intList);

        List<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog("Barkus"));
        dogList.add(new Dog("Dingdong"));

        printList(dogList);

    }

    // Generic method
    private static <T> void shout(T thingToShout, T otherThingToShout) {
        System.out.println(thingToShout + "!!!!!!! " + otherThingToShout + "!!!!!!!!!!!!!!");
    }

    private static void printList(List<?> myList) {
        System.out.println(myList);
    }

}
