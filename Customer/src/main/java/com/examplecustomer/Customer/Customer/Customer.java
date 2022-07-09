package com.examplecustomer.Customer.Customer;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Customer {

    @Id
    @SequenceGenerator(
        name="customer_sequence",
        sequenceName = "customer_sequence",
        allocationSize = 1
    )

    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "customer_sequence"
    )

    private long custIdKey;
    private String idNo;
    private String name;
    private LocalDate dob;
    private String address;
    private LocalDate regDate;


    public Customer() {
    }

    public Customer(long custIdKey, String idNo, String name, LocalDate dob, String address, LocalDate regDate) {
        this.custIdKey = custIdKey;
        this.idNo = idNo;
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.regDate = regDate;
    }

    public Customer(String idNo, String name, LocalDate dob, String address, LocalDate regDate) {
        this.idNo = idNo;
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.regDate = regDate;
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

    public String getIdNo() {
        return this.idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
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
