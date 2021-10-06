package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Ceo {

    private String name;

    public Ceo(@Qualifier("ceoName") String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Ceo" + " " + this.name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
