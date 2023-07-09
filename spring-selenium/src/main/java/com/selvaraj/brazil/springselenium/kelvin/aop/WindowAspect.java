package com.selvaraj.brazil.springselenium.kelvin.aop;

import com.selvaraj.brazil.springselenium.kelvin.annotation.Window;
import com.selvaraj.brazil.springselenium.kelvin.service.WindowSwitchService;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class WindowAspect {
    @Autowired
    private ApplicationContext ctx;

    @Autowired
    private WindowSwitchService switchService;

    @Before("@target(window) && within(com.selvaraj.brazil.springselenium..*)")
    public void before(Window window) {
        this.switchService.switchByTitle(window.value());
    }

    @After("@target(window) && within(com.selvaraj.brazil.springselenium..*)")
    public void after(Window window) {
        this.switchService.switchByIndex(0);
    }

}
