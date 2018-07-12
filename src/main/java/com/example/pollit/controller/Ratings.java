package com.example.pollit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ratings {

    @GetMapping("/ratings")
    public String getRatings() {
        return  "Hello  d";
    }
}
