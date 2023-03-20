package ru.jalolov.services.apifortestkotlindanger.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(@RequestParam(defaultValue = "user") String name) {
        return "Hello, " + name;
    }

    @GetMapping("/bye")
    public String bye(@RequestParam(defaultValue = "user") String name) {
        return "Bye, " + name;
    }
}
