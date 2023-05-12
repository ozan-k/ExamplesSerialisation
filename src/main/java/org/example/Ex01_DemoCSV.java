package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex01_DemoCSV {
    public static void main(String[] args) {
        String csvFile = "./src/test.csv";
        String line = "";
        String separator = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] token = line.split(separator);

                System.out.println("Country [code= " + token[4] + " , name=" + token[5] + "]");
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}