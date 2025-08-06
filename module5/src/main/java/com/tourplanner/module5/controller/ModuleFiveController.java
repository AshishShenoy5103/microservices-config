package com.tourplanner.module5.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModuleFiveController {
    @GetMapping("/hello")
    public String moduleMessage() {
        return "This is from Module 5";
    }
}
