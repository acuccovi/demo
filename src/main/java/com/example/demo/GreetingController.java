package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @GetMapping(produces = "application/pippo")
    public String greet(@RequestParam String name) {
        return new Greeting(name).greet();
    }
}
