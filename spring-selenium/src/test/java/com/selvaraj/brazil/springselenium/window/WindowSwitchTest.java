package com.selvaraj.brazil.springselenium.window;

import com.selvaraj.brazil.springselenium.SpringBaseTestNGTest;
import com.selvaraj.brazil.springselenium.kelvin.service.WindowSwitchService;
import com.selvaraj.brazil.springselenium.page.window.MainPage;
import com.selvaraj.brazil.springselenium.page.window.PageA;
import com.selvaraj.brazil.springselenium.page.window.PageB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.TestPropertySource;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@TestPropertySource(properties = "browser=firefox")
public class WindowSwitchTest extends SpringBaseTestNGTest {

    @Autowired
    private MainPage mainPage;

    @Autowired
    private PageA pageA;

    @Autowired
    private PageB pageB;

    @Autowired
    private WindowSwitchService switchService;

    @BeforeClass
    public void setUp() {
        this.mainPage.goTo();
        this.mainPage.isAt();
        this.mainPage.launchAllWindows();
    }

    @Test
    public void switchTest() {
        this.switchService.switchByTitle("Page A");
        this.pageA.addToArea("hi page A");
        this.switchService.switchByIndex(2);
        this.pageB.addToArea("Hello page B");
    }

}
