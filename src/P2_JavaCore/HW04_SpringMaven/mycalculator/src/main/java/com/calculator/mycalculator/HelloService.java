package com.calculator.mycalculator;

import org.springframework.stereotype.Service;

@Service
public class HelloService implements HelloInterface {
    public String hello() {
        return "Hello";
    }

    public String helloAnswer(String name) {
        return "Hello " + name;
    }
}