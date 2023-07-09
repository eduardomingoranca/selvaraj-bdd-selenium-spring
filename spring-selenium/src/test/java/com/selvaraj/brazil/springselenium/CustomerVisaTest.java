package com.selvaraj.brazil.springselenium;

import com.selvaraj.brazil.springselenium.entity.Customer;
import com.selvaraj.brazil.springselenium.page.visa.VisaRegistrationPage;
import com.selvaraj.brazil.springselenium.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import java.util.List;

import static java.time.ZoneId.systemDefault;

public class CustomerVisaTest extends SpringBaseTestNGTest{
    @Autowired
    private VisaRegistrationPage registrationPage;

    @Autowired
    private CustomerRepository repository;

    @Test
    public void visaTest() {
        List<Customer> customers = this.repository.findAll()
                .stream()
                .limit(3)
                .toList();

        for (Customer c: customers) {
            this.registrationPage.goTo();
            this.registrationPage.setNames(c.getFirstName(), c.getLastName());
            this.registrationPage.setCountryFromAndTo(c.getFromCountry(), c.getToCountry());
            this.registrationPage.setBirthDate(c.getDob().toInstant().atZone(systemDefault()).toLocalDate());
            this.registrationPage.setContactDetails(c.getEmail(), c.getPhone());
            this.registrationPage.setComments(c.getComments());
            this.registrationPage.submit();

            System.out.println(this.registrationPage.getConfirmationNumber());
        }
    }

}
