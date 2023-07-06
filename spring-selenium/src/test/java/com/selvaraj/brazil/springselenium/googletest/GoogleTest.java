package com.selvaraj.brazil.springselenium.googletest;

import com.selvaraj.brazil.springselenium.SpringBaseTestNGTest;
import com.selvaraj.brazil.springselenium.page.google.GooglePage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.testng.Assert.assertTrue;

public class GoogleTest extends SpringBaseTestNGTest {

    @Autowired
    private GooglePage googlePage;

    @Test
    public void googleTest() throws InterruptedException {
        this.googlePage.goTo();
        assertTrue(this.googlePage.isAt());

        this.googlePage.getSearchComponent().search("spring boot");
        assertTrue(this.googlePage.getSearchResult().isAt());
        assertTrue(this.googlePage.getSearchResult().getCount() > 2);
    }

}