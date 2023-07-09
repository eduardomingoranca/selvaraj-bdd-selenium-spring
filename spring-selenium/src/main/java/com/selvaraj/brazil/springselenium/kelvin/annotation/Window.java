package com.selvaraj.brazil.springselenium.kelvin.annotation;


import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Page
@Documented
@Target({TYPE})
@Retention(RUNTIME)
public @interface Window {
    String value() default "";
}
