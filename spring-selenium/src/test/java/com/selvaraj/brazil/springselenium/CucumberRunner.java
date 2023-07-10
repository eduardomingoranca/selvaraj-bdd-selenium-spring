package com.selvaraj.brazil.springselenium;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "classpath:features",
        glue = "com.selvaraj.brazil.springselenium.bdd",
        plugin = {
                "pretty",
                "html:/Users/eduar/Workspace/temp"
        }
)
public class CucumberRunner extends AbstractTestNGCucumberTests {

}
