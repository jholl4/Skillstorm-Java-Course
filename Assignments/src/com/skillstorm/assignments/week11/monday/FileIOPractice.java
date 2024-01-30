package com.skillstorm.assignments.week11.monday;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FileIOPractice {

    private static String path = "src\\com\\skillstorm\\assignments\\week11\\monday\\";
    private static String readFileName = "words_alpha.txt";
    private static String writeFileName = "long_words.txt";
    private static String palindromeFileName = "palindromes.txt";

    public static void main(String[] args) {
        printLongestWordInFile(readFileName);
        longWordWriter(readFileName);
        palindromeWriter(readFileName);

    }

    /**
     * method that reads in the contents of the file and finds the longest word.
     * Have your method print out the longest word and how many letters there are in
     * the word.
     */
    public static void printLongestWordInFile(String readFileName) {
        String line;
        String longest = "";
        boolean multipleLongest = false;
        List<String> longestList = new ArrayList<>();

        // Check every line in the file and if it's longer than the stored longest
        // string, reassign the longest string to the new line.
        try (BufferedReader reader = new BufferedReader(new FileReader(path + readFileName))) {
            while ((line = reader.readLine()) != null) {
                if (line.length() == longest.length()) {
                    multipleLongest = true;
                }
                if (line.length() > longest.length()) {
                    multipleLongest = false;
                    longest = line;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // If there are multiple lines of the same length, this will run through the
        // file a second time and collect the words into an ArrayList.
        try (BufferedReader reader = new BufferedReader(new FileReader(path + readFileName))) {
            if (multipleLongest) {
                while ((line = reader.readLine()) != null) {
                    if (line.length() == longest.length()) {
                        longestList.add(line);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // If there are multiple lines with the same length, the list will be printed;
        // if not, just the longest word will be printed.
        if (multipleLongest) {
            System.out.printf(
                    "There are multiple words in the file with the same length: %d letters. Here is the list:%n%s%n",
                    longestList.size(), longestList);
        } else {
            System.out.printf("The longest word in the file is %s%n", longest);

        }
    }

    /**
     * Reads in the contents of the file, and writes all the words
     * over 25 characters long to a file named long_words.txt
     */
    public static void longWordWriter(String readFileName) {

        String line;
        List<String> longWords = new ArrayList<>();

        // Read all words from the input file, adding them to a list of long words if
        // they're over 25 characters.
        try (BufferedReader reader = new BufferedReader(new FileReader(path + readFileName))) {
            while ((line = reader.readLine()) != null) {
                if (line.length() > 25) {
                    longWords.add(line.trim());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Write the list of long words to the file.
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path + writeFileName))) {
            writer.write("Here are all of the words from the input file that are over 25 characters long:\n\n");
            writer.write(String.join("\n", longWords));

            // let the user know that the file has been created or overwritten
            System.out.println("longWordWriter complete!");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * Reads in the contents of the file, and writes all the words
     * that are palindromes to a file named long_words.txt
     */
    public static void palindromeWriter(String readFileName) {

        String line; // temporary storage for each line of the file as we read through it
        List<String> palindromes = new ArrayList<>(); // list to store any palindromes as we find them

        // Read each word from the input file, reverse it using the stack push method,
        // and then compare it to the original word
        try (BufferedReader reader = new BufferedReader(new FileReader(path + readFileName))) {
            while ((line = reader.readLine()) != null) {
                StringBuilder reversedLine = new StringBuilder();
                LinkedList<Character> chars = new LinkedList<>();
                for (int i = 0; i < line.length(); i++) {
                    chars.push(line.charAt(i));
                }
                for (Character character : chars) {
                    reversedLine.append(character);
                }
                if (line.equals(reversedLine.toString())) // must convert StringBuilder to a String to compare
                    palindromes.add(line);
            }
        } catch (Exception e) {
            System.out.println("Exception in palindrome reader");
            e.printStackTrace();
        }

        // Write the list of palindromes to a file.
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path + palindromeFileName))) {
            writer.write("Here are all of the words from the input file that are palindromes:\n\n");
            writer.write(String.join("\n", palindromes));

            // let the user know that the file has been created or overwritten
            System.out.println("Palindrome Writer complete!");
        } catch (Exception e) {
            System.out.println("Exception in palindrome writer");
            e.printStackTrace();
        }

    }

}
