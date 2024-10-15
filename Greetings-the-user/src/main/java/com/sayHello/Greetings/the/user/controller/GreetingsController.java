package com.sayHello.Greetings.the.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    // Endpoint that uses @PathVariable and @RequestParam
    @GetMapping("/greet/{username}")
    public String greetUser(
            @PathVariable("username") String username,
            @RequestParam(value = "age", required = false, defaultValue = "18") int age) {

        return "Hello, " + username + "! You are " + age + " years old.";
    }

}

