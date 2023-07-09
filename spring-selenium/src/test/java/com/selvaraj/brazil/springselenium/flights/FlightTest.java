package com.selvaraj.brazil.springselenium.flights;

import com.selvaraj.brazil.springselenium.SpringBaseTestNGTest;
import com.selvaraj.brazil.springselenium.page.flights.FlightPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class FlightTest extends SpringBaseTestNGTest {
    @Autowired
    private FlightPage flightPage;

    @Autowired
    private FlightAppDetails appDetails;

    @Test
    public void flightTest() {
        this.flightPage.goTo(this.appDetails.getUrl());
        assertTrue(this.flightPage.isAt());

        assertEquals(this.flightPage.getLabels(), this.appDetails.getGetLabels());
    }

}
