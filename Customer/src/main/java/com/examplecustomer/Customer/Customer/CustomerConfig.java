package com.examplecustomer.Customer.Customer;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfig {
    
    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        List <Customer> custList = new ArrayList<Customer>();

        return args -> {
            Customer cust1 = new Customer("Customer Name 1", LocalDate.of(2001, Month.JANUARY, 1), "111111-10-1111", LocalDate.of(2022, Month.JULY, 9), "address 1");
            Customer cust2 = new Customer("Customer Name 2", LocalDate.of(2002, Month.FEBRUARY, 2), "222222-10-2222", LocalDate.of(2022, Month.JULY, 9), "address 2");

            custList.add(cust1);
            custList.add(cust2);

            customerRepository.saveAll(custList);
        };
    }
}
