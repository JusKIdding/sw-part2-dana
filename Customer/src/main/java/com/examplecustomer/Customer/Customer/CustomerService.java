package com.examplecustomer.Customer.Customer;

import java.util.*;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getCustomerList() {
        return customerRepository.findAll();

        /*
         * List<Customer> custList = new ArrayList<Customer>();
         * 
         * Customer newCust1 = new Customer((long)1, "Customer Name", LocalDate.of(2001,
         * 1, 1), "Id No", LocalDate.of(2022, 7, 9), "address");
         * 
         * custList.add(newCust1);
         * 
         * return custList;
         */
    }

    public void addNewCustomer(Customer customer) {
        Optional<Customer> customerOptional = customerRepository.findCustomerById(customer.getIdNo());

        if (customerOptional.isPresent()) {
            throw new IllegalStateException("The ID is already registered to the system.");
        }

        customerRepository.save(customer);

        // For debugging/checking ONLY
        /*
         * System.out.println("New Customer:: " + customer);
         * System.out.println("New Customer id KEY:: " + customer.getCustIdKey());
         * System.out.println("New Customer Name:: " + customer.getName());
         * System.out.println("New Customer DOB:: " + customer.getDob());
         * System.out.println("New Customer Reg Date:: " + customer.getRegDate());
         * System.out.println("New Customer Address:: " + customer.getAddress());
         * System.out.println("New Customer id:: " + customer.getIdNo());
         */
    }

    @Transactional
    public void updateCustomerInfo(Long custIdKey, String idNo, String address) {
        Customer customer = customerRepository.findById(custIdKey)
                .orElseThrow(() -> new IllegalStateException("This customer " + custIdKey + " does not exist"));

        //todo: maybe go with 14 to adapt to "-" in the IC
        if (idNo != null && idNo.length() == 12 && !Objects.equals(customer.getIdNo(), idNo)) {
            customer.setIdNo(idNo);
        }

        if (address != null && address.length() > 0 && !Objects.equals(customer.getAddress(), address)) {
            customer.setAddress(address);
        }
    }

}
