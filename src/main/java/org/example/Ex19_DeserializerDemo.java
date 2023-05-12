package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Ex19_DeserializerDemo {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        String fileName = "resources/employee.ser";
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
            try {
                while (true)
                    employees.add((Employee) in.readObject());
            } catch (IOException e) {
                System.out.println("Finished reading file.");
            } catch (ClassNotFoundException e) {
                System.out.println("Employee class not found");
                e.printStackTrace();
                return;
            }
        } catch (IOException i) {
            i.printStackTrace();
            return;
        }
        System.out.println("Deserialized employees...");
        employees.forEach(e -> System.out.printf("Name: %s, SSN: %s%n", e.name, e.SSN));
    }
}
