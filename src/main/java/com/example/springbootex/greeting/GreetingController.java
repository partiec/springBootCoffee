package com.example.springbootex.greeting;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
@RequiredArgsConstructor
public class GreetingController {
    private final Greeting greeting;

    @GetMapping
    String getGreeting() {
        return greeting.getName();
    }

    @GetMapping("/coffee")
    public String getNameAndCoffee() {
        return greeting.getCoffee();
    }
}
