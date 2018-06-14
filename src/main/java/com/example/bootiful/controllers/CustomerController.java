package com.example.bootiful.controllers;

import com.example.bootiful.domain.Customer;
import com.example.bootiful.domain.CustomerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
class CustomerRestController {

    private final CustomerRepository customerRepository;

    public CustomerRestController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @GetMapping("/customers")
    Collection<Customer> customerCollections() {
        return this.customerRepository.findAll();
    }

}