package com.calculator.mycalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final HelloInterface helloService;

    public HelloController(HelloInterface helloService) {
        this.helloService = helloService;
    }

    @GetMapping()
    public String hello() {
        return helloService.hello();
    }

    @GetMapping(path = "/hello")
    public String helloAnswer(@RequestParam("name") String name) {
        return helloService.helloAnswer(name);
    }
}