package com.example.greetings;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class GreetingController {
    private ArrayList<String> greetings = new ArrayList<>();
    // controller controls how a user interacts with our API

    // add parenthesis after the annotation if the url variable doesn't match the argument to the method
    @GetMapping("/greeting/{name}")
    public String hello(@PathVariable String name) {
        return "Hello " + name;
    }

    @GetMapping("/greeting")
    public String welcome(@RequestParam int id) {
        return "Hello your ID is: " + id;
    }

    @GetMapping("/greetings")
    public List<String> getGreetings() {
        return List.of(
                "Hello",
                "Hola",
                "Bonjour"
        );
    }

    @PostMapping("/greeting")
    public String createGreeting(@RequestBody String greeting) {
        greetings.add(greeting);
        return "Greeting added successfully";
    }

}
