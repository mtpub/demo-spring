package com.example.demo;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class DemoApplication {

    @GetMapping("/")
    String home() {
        return "<pre style='font-size: 16px; font-family: none;'>" +
                "Demo: Spring Boot is here! built on 20181229.\n" +
                "        1. test page: <a href='test.html'>click me</a>\n" +
                "</pre>";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
