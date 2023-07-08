package com.selvaraj.brazil.springselenium.annotation;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Lazy
@Component
@Scope("prototype")
@Documented
@Target({TYPE})
@Retention(RUNTIME)
public @interface PageFragment {

}
