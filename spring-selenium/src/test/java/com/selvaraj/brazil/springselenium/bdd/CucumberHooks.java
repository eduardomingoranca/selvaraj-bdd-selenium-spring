package com.selvaraj.brazil.springselenium.bdd;

import com.selvaraj.brazil.springselenium.kelvin.annotation.LazyAutowired;
import com.selvaraj.brazil.springselenium.kelvin.service.ScreenshotService;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class CucumberHooks {
    @LazyAutowired
    private ScreenshotService screenshotService;

    @AfterStep
    public void afterStep(Scenario scenario) {
        if (scenario.isFailed())
            scenario.embed(this.screenshotService.getScreenshot(), "image/png", scenario.getName());
    }
}
