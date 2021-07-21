package com.microservice.customer.mapper;

import com.microservice.customer.domain.model.Customer;
import com.microservice.customer.domain.model.CustomerDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    CustomerDto mapToDto(Customer customer);

    Customer mapTo(CustomerDto customerDto);
}
