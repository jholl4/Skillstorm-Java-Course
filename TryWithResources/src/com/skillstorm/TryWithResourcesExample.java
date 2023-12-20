package com.skillstorm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {
    public static void main(String[] args) throws Exception {

        String line = null;
        BufferedReader bufferedReader;
        try {
            FileReader fileReader = new FileReader("test.txt");
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Oops, something bad happened.");
        } finally {
            bufferedReader.close();

        }

    }
}
