package com.selvaraj.brazil.springselenium;

import com.selvaraj.brazil.springselenium.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

public class CustomerVisaTest extends SpringBaseTestNGTest{
    @Autowired
    private CustomerRepository repository;

    @Test
    public void visaTest() {
        this.repository.findById(85)
                .ifPresent(u -> System.out.println(u.getFirstName()));
    }

}
