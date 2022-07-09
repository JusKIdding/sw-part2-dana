package com.examplecustomer.Customer.Customer;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    
    @Query("SELECT c FROM Customer c WHERE id_no = ?1")
    Optional <Customer> findCustomerById(String idNo);

    // @Modifying
    // @Query("UPDATE Customer c SET c.IdNo = :idNo and c.address = :address WHERE c.IdNo = idNo" )
}
