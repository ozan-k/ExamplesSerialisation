package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class Ex04_ObjectSerialization {
    public static void main(String[] args) throws JsonProcessingException {

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
        String jsonData = mapper.writeValueAsString(student);
        System.out.println(jsonData);
    }
}
