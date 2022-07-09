package com.examplecustomer.Customer.Customer;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getCustomerList(){
        return customerRepository.findAll();


        /*List<Customer> custList = new ArrayList<Customer>();

        Customer newCust1 = new Customer((long)1, "Customer Name", LocalDate.of(2001, 1, 1), "Id No", LocalDate.of(2022, 7, 9), "address");

        custList.add(newCust1);

        return custList;*/
    }
}
