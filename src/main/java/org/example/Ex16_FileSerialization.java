package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;

public class Ex16_FileSerialization {
    public static void main(String[] args) throws IOException {
        class Student {
            public long id;
            public String name;

            public Student(long id, String name) {
                this.id = id;
                this.name = name;
            }
        }

        ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        Student student = new Student(123124, "John");
        mapper.writeValue(new File("student.json"), student);

        // We could also call writeValue() in the following ways:

        // mapper.writeValue(new FileWriter("student.json"), student);
        // mapper.writeValue(new FileOutputStream("student.json"), student);
    }
}
