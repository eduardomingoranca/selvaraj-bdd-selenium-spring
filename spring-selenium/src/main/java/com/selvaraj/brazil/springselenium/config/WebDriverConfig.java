package com.selvaraj.brazil.springselenium.config;

import com.selvaraj.brazil.springselenium.annotation.LazyConfiguration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;
import static io.github.bonigarcia.wdm.WebDriverManager.firefoxdriver;

@Profile("!remote")
@LazyConfiguration
public class WebDriverConfig {

    @Bean
    @ConditionalOnProperty(name = "browser", havingValue = "firefox")
    public WebDriver firefoxDriver() {
        firefoxdriver().setup();
        return new FirefoxDriver();
    }

    @Bean
    @Scope("browserscope")
    @ConditionalOnMissingBean
    public WebDriver chromeDriver() {
        chromedriver().version("113.0.5672.63").setup();
        return new ChromeDriver();
    }

}
