package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Ex17_FileDeserialization {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        Student student = mapper.readValue(new File("student.json"), Student.class);
        System.out.println(student);
    }
}
