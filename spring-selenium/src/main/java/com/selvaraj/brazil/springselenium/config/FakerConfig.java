package com.selvaraj.brazil.springselenium.config;

import com.github.javafaker.Faker;
import com.selvaraj.brazil.springselenium.annotation.LazyConfiguration;
import org.springframework.context.annotation.Bean;

@LazyConfiguration
public class FakerConfig {

    @Bean
    public Faker getFaker() {
        return new Faker();
    }
}
