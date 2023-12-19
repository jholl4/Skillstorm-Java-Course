package ConstructorChaining;

public class Cat extends Animal {

    String catFoodPreference;

    public Cat(String name, int age, String catFoodPreference) {
        /*
         * super()
         * - calls a constructor from the parent/super class
         * - must be the first line in the subclass constructor
         * - if you don't call super(), java will implicitly call the parent class
         * no-args constructor
         */
        super(name, age);
        this.catFoodPreference = catFoodPreference;
    }

    @Override // purely just semantics, lets us know it overrides the same method in the
              // parent class
    public void makeNoise() {
        super.makeNoise();
        System.out.println("meow meow meow!");
    }
}
