package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;
import java.util.List;

public class Ex12_CollectionSerialization {
    public static void main(String[] args) throws JsonProcessingException {

        class Student {
            public long id;
            public String name;

            public Student(long id, String name) {
                this.id = id;
                this.name = name;
            }
        }

        ObjectMapper mapper = new ObjectMapper();
        List<Student> students = Arrays.asList(
                new Student(1, "Filippo"),
                new Student(2, "Antonio"),
                new Student(3, "Claudio"));
        String jsonData = mapper.writeValueAsString(students);
        System.out.println(jsonData);
    }
}
