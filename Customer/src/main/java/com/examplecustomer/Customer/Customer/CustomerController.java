package com.examplecustomer.Customer.Customer;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/customer")
public class CustomerController {

    private final CustomerService customerService; 

    @Autowired
    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }
    
    @GetMapping
    public List<Customer> getCustomerList(){
        return customerService.getCustomerList();
    }
    
    @PostMapping
    public void addNewCustomer(@RequestBody Customer customer) {
        customerService.addNewCustomer(customer);
    }

    @PutMapping(path = "{custIdKey}")
    public void updateCustomerInfo(
        @PathVariable("custIdKey") Long custIdKey,
        @RequestParam(required = false) String idNo, 
        @RequestParam(required = false) String address) {
            
            customerService.updateCustomerInfo(custIdKey, idNo, address);
    }
}
