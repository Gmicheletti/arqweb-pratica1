package com.seuprojeto.controller.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/test")
    public String helloWorld(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Olá %s!", name);
    }
}
