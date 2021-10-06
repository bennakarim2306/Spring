package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = Company.class)
public class Config {

    @Bean
    public Address getAddress() {
        return  new Address("Leopolstr", 252);
    }
}
