package org.example;

class Student {
    public long id;
    public String name;

    @Override
    public String toString() {
        return String.format("I'm %s (id: %d).", name, id);
    }
}
