package ConstructorChaining;

public class Dog extends Animal {
    private String name;
    private String color;
    private int age;
    private String size;

    // default constructor
    public Dog() {
        this("Good Boy", "Brown", 3, "large");
    }

    // parameterized constructor
    public Dog(String name, String color, int age, String size) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void makeNoise() {
        System.out.println("woof woof woof!");
    }

}
