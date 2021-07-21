package com.microservice.customer.controller;

import com.microservice.customer.domain.model.CustomerDto;
import com.microservice.customer.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("/api/v1/customer")
@RestController
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping
    public List<CustomerDto> getCustomers() {
        List<CustomerDto> customers = customerService.getCustomers();
        return customers;
    }

    @GetMapping("/{creditId}")
    public ResponseEntity<CustomerDto> getCustomers(@PathVariable Long creditId)  {
         return customerService.getCustomer(creditId)
                 .map(ResponseEntity::ok)
                 .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public CustomerDto createCustomer(@RequestBody @Valid CustomerDto customerDto) {
        return customerService.createCustomer(customerDto);
    }
}
