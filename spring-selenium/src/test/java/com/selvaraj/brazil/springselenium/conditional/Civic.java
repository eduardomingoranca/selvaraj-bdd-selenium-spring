package com.selvaraj.brazil.springselenium.conditional;

import org.springframework.stereotype.Component;

@Component
public class Civic implements Car {
    @Override
    public void run() {
        System.out.println("I am civic. Speed is 60 mph");
    }
}
