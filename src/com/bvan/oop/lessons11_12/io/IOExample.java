package com.bvan.oop.lessons11_12.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class IOExample {

    public static void main(String[] args) {
        String fileName = "files/names.txt";
        String outFileName = "files/langs.txt";

        // 1. Create + Open a stream (+)
        // 2. IO Logic (+)
        // 3. Close the stream

        try {
            List<String> list = Arrays.asList("Java", "Python");
            writeLinesIntoFile(outFileName, list);
        } catch (FileNotFoundException e) {
            System.out.println("Sorry, file not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
    }

    private static void writeLinesIntoFile(String fileName, List<String> list) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter(fileName, true))) {

            for (String elem : list) {
                writer.write(elem);
                writer.newLine();
            }
        }
    }

    private static List<String> readLinesFromFile(String fileName) throws IOException {
        // try-with-resources
        try (BufferedReader reader = new BufferedReader(
                new FileReader(fileName))) {

            return readLines(reader);
        }
    }

    private static List<String> readLines(BufferedReader reader) throws IOException {
        List<String> res = new ArrayList<>();

        String line;
        while ((line = reader.readLine()) != null) {
            res.add(line);
        }
        return res;
    }


    private static String readLineFromFile(String fileName) throws IOException {
        // try-with-resources
        try (BufferedReader reader = new BufferedReader(
                new FileReader(fileName))) {

            return reader.readLine();
        }
    }

    /**
     * < Java 7 Style
     * @throws FileNotFoundException
     * @throws IOException
     */
    private static String readLineFromFileOld(String fileName) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            return reader.readLine();
        } finally {
            closeReader(reader);
        }
    }

    private static void closeReader(BufferedReader reader) {
        try {
            if (reader != null) {
                reader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
