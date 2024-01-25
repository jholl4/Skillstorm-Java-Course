package com.skillstorm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriteReadExample {

    public static void main(String[] args) {

        try (BufferedWriter writer = new BufferedWriter(
        new FileWriter("C:\\test\\writertest.txt"))) {
        System.out.println("Writing to file...");

        writer.write("Hello!\n");
        writer.write("World!\n");

        System.out.println("SUCCESS!");
        } catch (IOException e) {
        System.out.println(e.getMessage());
        }

        try (BufferedReader reader = new BufferedReader(
                new FileReader("C:\\test\\writertest.txt"))) {
            System.out.println("Reading from file...");

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            System.out.println("SUCCESS!");
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
    }

}
