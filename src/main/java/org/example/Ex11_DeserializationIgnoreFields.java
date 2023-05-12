package org.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Ex11_DeserializationIgnoreFields {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String jsonData = "{\n" +
                "  \"id\" : 123124,\n" +
                "  \"name\" : \"John\"\n" +
                "}";
        StudentIgnoreProperties student = mapper.readValue(jsonData, StudentIgnoreProperties.class);
        System.out.println(student);
    }

}
