package com.microservice.customer.controller;

import com.microservice.customer.domain.model.Customer;
import com.microservice.customer.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/customer")
@RestController
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(value = "getCustomers")
    public List<Customer> getCustomers() {
        List<Customer> customers = customerService.getCustomers();
        return customers;
    }

    @PostMapping(value = "createCustomer")
    public void createCustomer(@RequestBody Customer customer) {
        Customer customer1 = new Customer();
        customerService.createCustomer(customer1);
    }
}
