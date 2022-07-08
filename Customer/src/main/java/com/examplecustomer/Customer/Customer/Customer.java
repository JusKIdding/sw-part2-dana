package com.examplecustomer.Customer.Customer;

import java.time.LocalDate;

public class Customer {
    private long custIdKey;
    private String name;
    private LocalDate dob;
    private String Id;
    private LocalDate regDate;
    private String address;


    public Customer() {
    }

    public Customer(long custIdKey, String name, LocalDate dob, String Id, LocalDate regDate, String address) {
        this.custIdKey = custIdKey;
        this.name = name;
        this.dob = dob;
        this.Id = Id;
        this.regDate = regDate;
        this.address = address;
    }

    public Customer(String name, LocalDate dob, String Id, LocalDate regDate, String address) {
        this.name = name;
        this.dob = dob;
        this.Id = Id;
        this.regDate = regDate;
        this.address = address;
    }


    public long getCustIdKey() {
        return this.custIdKey;
    }

    public void setCustIdKey(long custIdKey) {
        this.custIdKey = custIdKey;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return this.dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getId() {
        return this.Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public LocalDate getRegDate() {
        return this.regDate;
    }

    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
