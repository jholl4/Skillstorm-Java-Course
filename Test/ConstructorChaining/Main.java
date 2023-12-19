package ConstructorChaining;

public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat("Mishmish", 10, "Tuna");
        System.out.println(
                myCat.name + " is " + myCat.age + " years old, and her favorite food is " + myCat.catFoodPreference);

        myCat.makeNoise();

        Dog myDog = new Dog();
        System.out.printf("My dog's name is %s, he is %d years old and he is %s%n", myDog.getName(), myDog.getAge(),
                myDog.getColor());
        myDog.makeNoise();
    }
}
