package org.example;

import lombok.Data;

@Data
public class Human {
    private String name;
    private String lastname;
    private int age;

    public Human(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }
}
