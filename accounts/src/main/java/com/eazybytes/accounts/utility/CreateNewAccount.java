package com.eazybytes.accounts.utility;

import com.eazybytes.accounts.constants.AccountsConstant;
import com.eazybytes.accounts.entity.Accounts;
import com.eazybytes.accounts.entity.Customer;

import java.util.Random;

public class CreateNewAccount {

	public static Accounts createAccount( Customer customer ) {
		Accounts newAccount = new Accounts();
		newAccount.setCustomerId(customer.getCustomerId());
		long randomAccountNumber = 100000000L + new Random().nextInt(900000000);
		newAccount.setAccountNumber(randomAccountNumber);
		newAccount.setAccountType(AccountsConstant.SAVINGS);
		newAccount.setBranchAddress(AccountsConstant.ADDRESS);
		return newAccount;
	}
}
