package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex02_JacksonDemo {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        System.out.println(mapper.writeValueAsString(1));
        System.out.println(mapper.writeValueAsString(10L));
        System.out.println(mapper.writeValueAsString(10.0));
        System.out.println(mapper.writeValueAsString("abcd"));
        System.out.println(mapper.writeValueAsString('A'));
        System.out.println(mapper.writeValueAsString(false));

        int[] values = { 1, 2, 3, 4 };
        System.out.println(mapper.writeValueAsString(values));

        List<Integer> list = Arrays.asList( 1, 2, 3, 4 );
        System.out.println(mapper.writeValueAsString(list));

        Map<String, Integer> map = new HashMap<>();
        map.put("Rick",1);
        map.put("Morty",2);
        map.put("Summer",3);
        System.out.println(mapper.writeValueAsString(map));
    }
}
