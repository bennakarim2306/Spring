package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Company {
    private Address address;

    @Override
    public String toString() {
        return "Company{" +
                "address=" + address +
                '}';
    }

    public Company(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
