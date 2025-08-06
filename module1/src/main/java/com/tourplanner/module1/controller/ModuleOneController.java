package com.tourplanner.module1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModuleOneController {
    @GetMapping("/hello")
    public String moduleMessage() {
        return "This is from Module1";
    }
}
