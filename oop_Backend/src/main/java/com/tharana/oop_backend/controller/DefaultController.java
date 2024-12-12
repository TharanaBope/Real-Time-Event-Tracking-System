package com.tharana.oop_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController// This class is a REST controller
public class DefaultController {

    @GetMapping("/")// The home method is mapped to the root endpoint
    public String home() {
        return "Welcome to the Event Ticketing System Backend!";
    }
}

