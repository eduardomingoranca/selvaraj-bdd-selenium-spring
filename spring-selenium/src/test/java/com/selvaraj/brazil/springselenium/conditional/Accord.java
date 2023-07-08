package com.selvaraj.brazil.springselenium.conditional;

import org.springframework.stereotype.Component;

@Component
public class Accord implements Car{

    @Override
    public void run() {
        System.out.println("This is Accord. Speed is 80 mph");
    }
}
