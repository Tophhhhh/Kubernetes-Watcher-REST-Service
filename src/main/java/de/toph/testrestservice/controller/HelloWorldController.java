package de.toph.testrestservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Value("${rest.service.test.value}")
    private String value;

    @GetMapping("/hello-world")
    public String helloWorld() {
        return value;
    }
}
