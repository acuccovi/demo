package com.example.demo;

public class Greeting {
    private String name;

    public Greeting(String name) {
        this.name = name;
    }

    public String greet() {
        return "Hello " + name;
    }
}
