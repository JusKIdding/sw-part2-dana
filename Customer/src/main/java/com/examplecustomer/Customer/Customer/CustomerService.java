package com.examplecustomer.Customer.Customer;

import java.security.cert.PKIXRevocationChecker.Option;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public void addNewCustomer(Customer customer) {
        Optional<Customer> customerOptional = customerRepository.findCustomerById(customer.getIdNo());

        if (customerOptional.isPresent()) {
            throw new IllegalStateException("The ID is already registered to the system.");
        }

        customerRepository.save(customer);

        System.out.println("New Customer:: " + customer);
        System.out.println("New Customer id KEY:: " + customer.getCustIdKey());
        System.out.println("New Customer Name:: " + customer.getName());
        System.out.println("New Customer DOB:: " + customer.getDob());
        System.out.println("New Customer Reg Date:: " + customer.getRegDate());
        System.out.println("New Customer Address:: " + customer.getAddress());
        System.out.println("New Customer id:: " + customer.getIdNo());
    }
}
