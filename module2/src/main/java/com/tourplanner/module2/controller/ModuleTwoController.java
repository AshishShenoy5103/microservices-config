package com.tourplanner.module2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModuleTwoController {
    @GetMapping("/hello")
    public String moduleMessage() {
        return "This is from Module 2";
    }
}
