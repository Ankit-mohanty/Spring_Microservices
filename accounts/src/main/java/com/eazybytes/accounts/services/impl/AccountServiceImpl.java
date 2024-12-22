package com.eazybytes.accounts.services.impl;


import com.eazybytes.accounts.DTO.CustomerDto;
import com.eazybytes.accounts.entity.Customer;
import com.eazybytes.accounts.exception.CustomerAlreadyExistsException;
import com.eazybytes.accounts.mapper.CustomersMapper;
import com.eazybytes.accounts.repository.AccountsRepository;
import com.eazybytes.accounts.repository.CustomerRepository;
import com.eazybytes.accounts.services.IAccountService;
import com.eazybytes.accounts.utility.CreateNewAccount;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements IAccountService {

	private final AccountsRepository accountsRepository;
	private final CustomerRepository customerRepository;


	@Override
	public void createAccount( CustomerDto customerDto ) {
		Customer customer = CustomersMapper.mapToCustomer(customerDto, new Customer());
		Customer savedCustomer = customerRepository.save(customer);
		Optional<Customer> optionalCustomer = customerRepository.findByMobileNumber(customerDto.getMobileNumber());
		if( optionalCustomer.isPresent() ){
			throw  new CustomerAlreadyExistsException("Customer Already Registered In Given Mobile Number"+
			customerDto.getMobileNumber());
		}
		accountsRepository.save(CreateNewAccount.createAccount(savedCustomer));

	}


}
