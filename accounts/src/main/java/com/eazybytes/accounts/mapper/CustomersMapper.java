package com.eazybytes.accounts.mapper;

import com.eazybytes.accounts.DTO.CustomerDto;
import com.eazybytes.accounts.entity.Customer;

public class CustomersMapper {
	// Mappers for customer entity to customer model and vice versa
	// Implement methods to convert between customer entity and customer model
	public static CustomerDto mapTocustomerDto( CustomerDto customerDto, Customer customer ) {
		customerDto.setName(customer.getName());
		customerDto.setEmail(customer.getEmail());
		customerDto.setMobileNumber(customer.getMobileNumber());
		return customerDto;
	}

	public static Customer mapToCustomer(CustomerDto customerDto, Customer customer ) {
		customer.setName(customerDto.getName());
        customer.setEmail(customerDto.getEmail());
        customer.setMobileNumber(customerDto.getMobileNumber());
        return customer;
	}
}
