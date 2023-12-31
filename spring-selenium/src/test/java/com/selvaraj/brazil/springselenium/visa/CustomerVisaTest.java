package com.selvaraj.brazil.springselenium.visa;

import com.selvaraj.brazil.springselenium.SpringBaseTestNGTest;
import com.selvaraj.brazil.springselenium.entity.Customer;
import com.selvaraj.brazil.springselenium.page.visa.VisaRegistrationPage;
import com.selvaraj.brazil.springselenium.repository.CustomerRepository;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.sql.Date;

import static java.time.ZoneId.systemDefault;
import static org.slf4j.LoggerFactory.getLogger;

public class CustomerVisaTest extends SpringBaseTestNGTest {
    public static final Logger logger = getLogger(CustomerVisaTest.class);

    @Autowired
    private VisaRegistrationPage registrationPage;

    @Autowired
    private CustomerRepository repository;

    @Test(dataProvider = "getData")
    public void visaTest(Customer c) {
        this.registrationPage.goTo();
        this.registrationPage.setNames(c.getFirstName(), c.getLastName());
        this.registrationPage.setCountryFromAndTo(c.getFromCountry(), c.getToCountry());
        this.registrationPage.setBirthDate(c.getDob().toInstant().atZone(systemDefault()).toLocalDate());
        this.registrationPage.setContactDetails(c.getEmail(), c.getPhone());
        this.registrationPage.setComments(c.getComments());
        this.registrationPage.submit();

        logger.info("Request confirmation # INFO : " + this.registrationPage.getConfirmationNumber());
        logger.warn("Request confirmation # WARN : " + this.registrationPage.getConfirmationNumber());
    }

    @DataProvider
    public Object[] getData(ITestContext context) {
        return this.repository.findByDobBetween(
                        Date.valueOf(context.getCurrentXmlTest().getParameter("dobFrom")),
                        Date.valueOf(context.getCurrentXmlTest().getParameter("dobTo"))
                )
                .stream()
                .limit(1)
                .toArray();
    }

}
