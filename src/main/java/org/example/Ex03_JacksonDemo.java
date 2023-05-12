package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Ex03_JacksonDemo {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        int i = mapper.readValue("1", int.class);
        System.out.println(i);

        long l = mapper.readValue("1", long.class);
        System.out.println(l);

        double d = mapper.readValue("1", double.class);
        System.out.println(d);

        String s = mapper.readValue("\"Rick\"", String.class);
        System.out.println(s);

        char c = mapper.readValue("\"R\"", char.class);
        System.out.println(c);

        boolean b = mapper.readValue("false", boolean.class);
        System.out.println(b);

        int[] array = mapper.readValue("[1,2,3,4]", int[].class);
        System.out.println(Arrays.toString(array));

        List<Integer> list = mapper.readValue("[1,2,3,4]", new TypeReference<List<Integer>>(){});
        System.out.println(list);

        Map<String, Integer> map = mapper.readValue("{\"Morty\":2,\"Rick\":1,\"Summer\":3}",
                new TypeReference<Map<String,Integer>>(){});
        System.out.println(map);
    }
}
