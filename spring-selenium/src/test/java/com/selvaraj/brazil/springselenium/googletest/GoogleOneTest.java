package com.selvaraj.brazil.springselenium.googletest;

import com.selvaraj.brazil.springselenium.SpringBaseTestNGTest;
import com.selvaraj.brazil.springselenium.page.google.GooglePage;
import com.selvaraj.brazil.springselenium.kelvin.service.ScreenshotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertTrue;

public class GoogleOneTest extends SpringBaseTestNGTest {

    @Autowired
    private GooglePage googlePage;

    @Lazy
    @Autowired
    private ScreenshotService screenshotService;

    @Test
    public void googleTest() throws IOException {
        this.googlePage.goTo();
        assertTrue(this.googlePage.isAt());

        this.googlePage.getSearchComponent().search("spring boot");
        assertTrue(this.googlePage.getSearchResult().isAt());
        assertTrue(this.googlePage.getSearchResult().getCount() > 2);
        this.screenshotService.takeScreenShot();
        this.googlePage.close();
    }

}
