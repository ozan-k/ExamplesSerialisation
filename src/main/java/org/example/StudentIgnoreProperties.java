package org.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties("id")
public class StudentIgnoreProperties {
    public long id;
    public String name;

    @Override
    public String toString() {
        return String.format("I'm %s (id: %d).", name, id);
    }
}

