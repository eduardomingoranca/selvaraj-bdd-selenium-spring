package com.selvaraj.brazil.springselenium.googletest;

import com.selvaraj.brazil.springselenium.SpringBaseTestNGTest;
import com.selvaraj.brazil.springselenium.kelvin.annotation.LazyAutowired;
import com.selvaraj.brazil.springselenium.kelvin.service.ScreenshotService;
import com.selvaraj.brazil.springselenium.page.google.GooglePage;
import org.junit.jupiter.api.Test;


import java.io.IOException;

import static org.testng.Assert.assertTrue;


public class GoogleTwoTest extends SpringBaseTestNGTest {
    @LazyAutowired
    private GooglePage googlePage;

    @LazyAutowired
    private ScreenshotService screenshotService;

    @Test
    public void googleTest() throws IOException {
        this.googlePage.goTo();
        assertTrue(this.googlePage.isAt());

        this.googlePage.getSearchComponent().search("selenium");
        assertTrue(this.googlePage.getSearchResult().isAt());
        assertTrue(this.googlePage.getSearchResult().getCount() > 2);
        this.screenshotService.takeScreenShot();
        this.googlePage.close();
    }
}
