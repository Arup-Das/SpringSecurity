package com.arup.springsecuritysec2.repository;

import com.arup.springsecuritysec2.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer,Integer> {
    List<Customer> findByEmail(String email);
}
