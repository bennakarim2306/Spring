package com.example.demo;

import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {Company.class, Ceo.class})
public class Config {


    @Bean
    public Address getAddress() {
        return new Address("Leopolstr", 252);
    }

    @Bean
    @Qualifier("ceoName")
    public String getName() {
        return "CEO David";
    }


    @Bean
    @Qualifier("companyName")
    public String getCompanyName() {
        return "IC-Consult GmbH";
    }
}
