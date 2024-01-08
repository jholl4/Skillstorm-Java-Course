package week8.monday;

// PART 1

public class Student {

    private String firstName;
    private String lastName;
    private int studentId;
    private static int numberOfStudents;

    public Student() {
        numberOfStudents += 1;
        this.studentId = numberOfStudents;
    }

    public Student(String firstName, String lastName) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static int getNumberOfStudents() {
        return numberOfStudents;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Student [firstName=" + firstName + ", lastName=" + lastName + ", studentId=" + studentId + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + studentId;
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
        Student other = (Student) obj;
        if (studentId != other.studentId)
            return false;
        return true;
    }

}

// PART 2

class Color {

    public static void main(String[] args) {
        Color white = new Color();
        Color red = new Color("red", 255, 0, 0);

        System.out.println(white);
        System.out.println(red);
    }

    private String name;
    private byte r;
    private byte g;
    private byte b;

    public Color() {
        this("white", 255, 255, 255);
    }

    public Color(String name, int r, int g, int b) {
        if (r < 0 || r > 255 || g < 0 || g > 255 || b < 0 || b > 255)
            throw new IllegalArgumentException("Each value must be in range 0-255!");
        this.name = name;
        this.r = (byte) (r - 128);
        this.g = (byte) (g - 128);
        this.b = (byte) (b - 128);
    }

    public String getName() {
        return name;
    }

    public byte getR() {
        return r;
    }

    public byte getG() {
        return g;
    }

    public byte getB() {
        return b;
    }

    @Override
    public String toString() {
        return "Color: " + name + ", r=" + (r + 128) + ", g=" + (g + 128) + ", b=" + (b + 128);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + r;
        result = prime * result + g;
        result = prime * result + b;
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
        Color other = (Color) obj;
        if (r != other.r)
            return false;
        if (g != other.g)
            return false;
        if (b != other.b)
            return false;
        return true;
    }

}

// PART 3

/*
 * 1. What is the HashCode-Equals contract?
 * - (reflexive)An object must equal itself
 * - (symmetric)x.equals(y) must return the same result as y.equals(x)
 * - (transitive)If x.equals(y) and y.equals(z) then x should also equal z
 * - (consistent)The value of .equals() shouls only change if a property that is
 * contained in equals() changes. No randomness!
 * 
 * 2. Given two objects obj1 and obj2 have the same hash code, does
 * obj1.equals(ob2) always return true? Why or why not?
 * - Yes, because of "internal consistency" and "equals consistency". the value
 * of a hashcode should only change if one of the properties in equals changes,
 * and objects that are equal to each other must return the sam hascode.
 * 
 * 3. Why isn't the below implementation appropriate for a hashCode() method?
 * 
 * @Override
 * public int hashCode() {
 * return (int) (Math.random() * 100);
 * }
 * - Because of the consistency part of the hashcode/equals contract. No
 * randomness is allowed in the hashcode because this would result in
 * inconsistencies with the equals method.
 */