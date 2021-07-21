package com.microservice.customer.service;

import com.microservice.customer.domain.model.Customer;
import com.microservice.customer.domain.model.CustomerDto;
import com.microservice.customer.domain.repository.CustomerRepository;
import com.microservice.customer.mapper.CustomerMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final static CustomerMapper mapper = CustomerMapper.INSTANCE;
    private final CustomerRepository repository;

    public List<CustomerDto> getCustomers() {
        return repository.findAll()
                .stream()
                .map(mapper::mapToDto)
                .collect(Collectors.toList());
    }

    public Optional<CustomerDto> getCustomer(Long creditId) {
        return repository.findById(creditId)
                .map(mapper::mapToDto);
    }

    public CustomerDto createCustomer(final CustomerDto customerDto) {
        Customer customer = mapper.mapTo(customerDto);
        repository.save(customer);
        return mapper.mapToDto(customer);
    }
}
