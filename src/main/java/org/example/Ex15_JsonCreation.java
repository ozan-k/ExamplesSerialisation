package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class Ex15_JsonCreation {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);

        ObjectNode rick = mapper.createObjectNode();
        rick.put("name", "Rick");
        rick.put("hair", "blue");

        ObjectNode morty = mapper.createObjectNode();
        morty.put("name", "Morty");
        morty.put("hair", "brown");

        ObjectNode summer = mapper.createObjectNode();
        summer.put("name", "Summer");
        summer.put("hair", "red");

        ArrayNode characters = mapper.createArrayNode();
        characters.add(rick);
        characters.add(morty);
        characters.add(summer);

        System.out.println(mapper.writeValueAsString(characters));
    }
}
