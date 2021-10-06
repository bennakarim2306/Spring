package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Company")
public class Company {

    private Address address;
    private String companyName;

    @Override
    public String toString() {
        return "Company{" +
                "address=" + address.toString() +
                "name=" + companyName +
                '}';
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Company(Address address, @Qualifier("companyName") String companyName) {
        this.address = address;
        this.companyName = companyName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
