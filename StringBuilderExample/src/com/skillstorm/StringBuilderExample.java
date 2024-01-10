package com.skillstorm;

public class StringBuilderExample {

    /*
     * Strings are immutable
     * - which means that a new string is created in memory every time you change a
     * String variable
     * 
     * StringBuilder
     * - a mutable sequence of characters
     * - any changes will just modify the existing sequence of characters created in
     * memory
     * - provides methods to modify, append, insert, delete and perform various
     * operations
     * on strings without creating new objects every time or new space sin memory
     */

    public static void main(String[] args) {
        // We create a new string but we can't modify it because it is immutable, have
        // to create a new object
        String str = "String";
        str.concat("another string");

        str = str.concat("another string");

        System.out.println("Concatenated string: " + str);

        // StringBuilder
        StringBuilder sb = new StringBuilder("Vanilla");
        sb.append(" and chocolate");
        sb.append(" and strawberry");
        System.out.println(sb);

        StringBuilder sb2 = new StringBuilder("StringBuilder");
        System.out.println(sb2);
        // start index is inclusive, end index is exclusive
        sb2.replace(1, 22, "WOAH");
        System.out.println(sb2);

        StringBuilder sb3 = new StringBuilder("Fruits: ");
        sb3.append("apples, ");
        sb3.append("oranges, ");
        sb3.append("watermelon, ");

        System.out.println(sb3);

        sb3.reverse();
        System.out.println(sb3);

        str = sb3.reverse().toString();
        System.out.println(str);

        StringBuilder sb4 = new StringBuilder("Josh");


    }

}
