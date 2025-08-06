package com.tourplanner.module3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModuleThreeController {
    @GetMapping("/hello")
    public String moduleMessage() {
        return "This is from Module 3";
    }
}
