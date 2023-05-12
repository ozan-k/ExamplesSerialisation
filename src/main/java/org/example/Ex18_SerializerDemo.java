package org.example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ex18_SerializerDemo {
    public static void main(String [] args) {
        String fileName = "resources/employee.ser";
        Employee e1 = new Employee("Rick", 131241);
        Employee e2 = new Employee("Morty", 12314);
        Employee e3 = new Employee("Summer", 512512);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))){
            out.writeObject(e1);
            out.writeObject(e2);
            out.writeObject(e3);
            System.out.printf("Serialized data is saved in %s",fileName);
        }catch(IOException i) {
            i.printStackTrace();
        }
    }
}
