package com.example.example;

import java.io.*;
import java.util.*;

/*
 * Author: LuisM
 */

public class LecturaCSV {
    private static final String COMMA_DELIMITER = ",";
    
    public static void main(String[] args) {
        String filePath = "disenoT2/src/CSV/Alumnos.csv";
        String[][] data = readFile(filePath);
        if (data == null) {
            System.out.println("File not found or invalid data");
            return;
        }
        for (String[] row : data) {
            for (String column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
    private static String[][] readFile(String filePath) {
        List<String[]> rows = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(COMMA_DELIMITER);
                rows.add(values);
            }
            return rows.toArray(new String[0][0]);
        } catch (IOException e) {
            System.out.println("Error reading file");
            return null;
        }
    }
}
