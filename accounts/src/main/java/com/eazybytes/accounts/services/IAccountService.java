package com.eazybytes.accounts.services;

import com.eazybytes.accounts.DTO.CustomerDto;

public interface IAccountService {
/**
 * @implNote
 * this method is to get customer details
 * 
 */
	void createAccount( CustomerDto customerDto );
}
