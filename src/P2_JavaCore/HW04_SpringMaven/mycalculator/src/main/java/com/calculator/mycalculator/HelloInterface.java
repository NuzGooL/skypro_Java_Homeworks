package com.calculator.mycalculator;

import org.springframework.stereotype.Service;

@Service
public interface HelloInterface {
    String hello();

    String helloAnswer(String name);
}
