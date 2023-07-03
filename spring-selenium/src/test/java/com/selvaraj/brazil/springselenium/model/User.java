package com.selvaraj.brazil.springselenium.model;

import org.springframework.stereotype.Component;

@Component
public class User {

    private Address address;
    private Salary salary;

    public User() {

    }

    public void printDetails() {
        System.out.println("Address : " + this.address.getStreet());
        System.out.println("Salary : " + this.salary.getAmount());
    }
}
