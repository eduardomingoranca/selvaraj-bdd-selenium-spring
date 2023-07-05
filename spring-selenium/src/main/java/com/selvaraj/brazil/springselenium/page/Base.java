package com.selvaraj.brazil.springselenium.page;

import jakarta.annotation.PostConstruct;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;

import static org.openqa.selenium.support.PageFactory.initElements;

public abstract class Base {

    @Autowired
    protected WebDriver driver;

    @Autowired
    protected WebDriverWait wait;

    @PostConstruct
    private void init() {
        initElements(this.driver, this);
    }

    public abstract boolean isAt();

}
