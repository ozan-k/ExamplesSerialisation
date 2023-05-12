package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Ex14_UnknownDeserialization {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        String json = "[ \n" +
                "  { \"name\" : \"Rick\", \"hair\" : \"blue\" }, \n" +
                "  { \"name\" : \"Morty\", \"hair\" : \"brown\" }, \n" +
                "  { \"name\" : \"Summer\", \"hair\" : \"red\" } \n" +
                "]";

        JsonNode node = mapper.readTree(json);
        System.out.println("Is array: "+node.isArray());
        System.out.println("Value at index 1, field \"name\": "+node.get(1).get("name"));
        System.out.println(node.toPrettyString());
    }
}
