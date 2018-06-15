package com.example.bootiful.controllers;

import com.example.bootiful.domain.Customer;
import com.example.bootiful.domain.CustomerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
class CustomerRestController {

    private List<Customer> customerInMemoryList = new ArrayList<Customer>();
    private final AtomicLong counter = new AtomicLong();

    private final CustomerRepository customerRepository;

    public CustomerRestController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @GetMapping("/customers")
    Collection<Customer> customerCollections() {
        return this.customerRepository.findAll();
    }


    @PostMapping("/newcustomer")
    public Customer createNewCustomer(@RequestBody Customer customer) {
        customer.setId(counter.incrementAndGet());
        customerInMemoryList.add(customer);
        return customer;
    }
}