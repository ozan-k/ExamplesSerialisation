package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Ex10_ObjectDeserialization {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String jsonData = "{\n" +
                "  \"id\" : 123124,\n" +
                "  \"name\" : \"John\"\n" +
                "}";
        Student student = mapper.readValue(jsonData, Student.class);
        System.out.println(student);
    }

}
