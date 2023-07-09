package com.selvaraj.brazil.springselenium.kelvin.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Bean
@Scope("browserscope")
@Documented
@Target({METHOD})
@Retention(RUNTIME)
public @interface ThreadScopeBean {

}
