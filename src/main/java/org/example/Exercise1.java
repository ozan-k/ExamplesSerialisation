package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise1 {
    public static void main(String[] args) {
        String csvFile = "./src/example1data.csv";
        String line = "";
        String separator = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] token = line.split(separator);
                System.out.println(
                        (Integer.parseInt(token[1])+Integer.parseInt(token[2]))
                );
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
