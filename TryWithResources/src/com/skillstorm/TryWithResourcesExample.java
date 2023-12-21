package com.skillstorm;

import java.io.BufferedReader;
import java.io.FileReader;

public class TryWithResourcesExample {
    public static void main(String[] args) throws Exception {

        String line = null;
        try {
            FileReader fileReader = new FileReader("test.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("Oops, something bad happened.");
        } finally{
            fileReader.close();
            bufferedReader.close();
        }
        
        

    }
}
