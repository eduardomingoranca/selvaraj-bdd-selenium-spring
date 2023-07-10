package com.selvaraj.brazil.springselenium;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        strict = true,
        features = "classpath:features",
        glue = "com.selvaraj.brazil.springselenium.bdd",
        tags = { "@smoke" },
        plugin = {
                "pretty",
                "html:/Users/eduar/Workspace/temp"
        }
)
public class CucumberRunner extends AbstractTestNGCucumberTests {

        @Override
        @DataProvider(parallel = true)
        public Object[][] scenarios() {
                return super.scenarios();
        }

}
