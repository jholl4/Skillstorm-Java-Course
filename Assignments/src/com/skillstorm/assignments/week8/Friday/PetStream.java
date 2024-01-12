package com.skillstorm.assignments.week8.Friday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PetStream {

    public static void mostPets(List<Person> petOwners) {
        int maxPets = petOwners.stream().mapToInt(person -> person.getPets().size()).max().orElse(0);
        System.out.println(maxPets + " pets");
    }

    public static void main(String[] args) {
        Person person1 = new Person("Jim");
        Person person2 = new Person("Joe");
        Person person3 = new Person("Joanna");
        Person person4 = new Person("Josh");
        Pet pet1 = new Pet("Athena", new Random().nextInt(10) + 1);
        Pet pet2 = new Pet("Bilbo", new Random().nextInt(10) + 1);
        Pet pet4 = new Pet("Charles", new Random().nextInt(10) + 1);
        Pet pet5 = new Pet("Dori", new Random().nextInt(10) + 1);
        Pet pet6 = new Pet("Fudd", new Random().nextInt(10) + 1);
        Pet pet7 = new Pet("Goose", new Random().nextInt(10) + 1);
        Pet pet8 = new Pet("Hemsworth", new Random().nextInt(10) + 1);
        Pet pet9 = new Pet("Ivory", new Random().nextInt(10) + 1);
        Pet pet10 = new Pet("Jibbles", new Random().nextInt(10) + 1);
        Pet pet11 = new Pet("Kranky", new Random().nextInt(10) + 1);
        Pet pet12 = new Pet("Lima Bean", new Random().nextInt(10) + 1);
        Pet pet13 = new Pet("Moose", new Random().nextInt(10) + 1);
        Pet pet14 = new Pet("Norma", new Random().nextInt(10) + 1);
        Pet pet15 = new Pet("Ol' Ness", new Random().nextInt(10) + 1);
        Pet pet3 = new Pet("Pickles", new Random().nextInt(10) + 1);

        person1.setPets(Arrays.asList(pet1, pet2, pet12));
        person2.setPets(Arrays.asList(pet3, pet4));
        person3.setPets(Arrays.asList(pet5, pet6, pet7, pet8, pet9));
        person4.setPets(Arrays.asList(pet10, pet11, pet13, pet14, pet15));

        List<Person> personList = new ArrayList<>();
        personList.addAll(Arrays.asList(person1, person2, person3, person4));
        personList.stream().forEach(person -> System.out.println(person));

        mostPets(personList);

    }

}

class Person {
    private String name;
    private List<Pet> pets;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, List<Pet> pets) {
        this.name = name;
        this.pets = pets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    @Override
    public String toString() {
        return name + ", pets: " + pets;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((pets == null) ? 0 : pets.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (pets == null) {
            if (other.pets != null)
                return false;
        } else if (!pets.equals(other.pets))
            return false;
        return true;
    }

}

class Pet {
    private String name;
    private int age;

    public Pet() {
        this.name = "anonymous pet";
    }

    public Pet(String name) {
        this.name = name;
    }

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ", " + age + " year(s) old";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + age;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pet other = (Pet) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (age != other.age)
            return false;
        return true;
    }

}
