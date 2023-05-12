package org.example;

public class Employee implements java.io.Serializable {
    public String name;
    public transient int SSN;

    public Employee(String name, int SSN) {
        this.name = name;
        this.SSN = SSN;
    }

    public void mailCheck() {
        System.out.println("Mailing a check to " + name + ". ");
    }
}
