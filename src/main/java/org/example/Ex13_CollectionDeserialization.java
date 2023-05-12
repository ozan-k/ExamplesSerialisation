package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;

public class Ex13_CollectionDeserialization {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String jsonData = "[ \n" +
                "  { \"id\": 1, \"name\": \"Filippo\" }, \n" +
                "  { \"id\": 2, \"name\": \"Antonio\" }, \n" +
                "  { \"id\": 3, \"name\": \"Claudio\" } \n" +
                "]";
        ArrayList<Student> students = mapper.readValue(jsonData, new TypeReference<ArrayList<Student>>(){});
        System.out.println(students);
    }
}
