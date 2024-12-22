package com.eazybytes.accounts.mapper;

import com.eazybytes.accounts.DTO.AccountsDto;
import com.eazybytes.accounts.entity.Accounts;

public class AccountMapper {

	public static AccountsDto maoToAccountDto( Accounts accounts, AccountsDto accountsDto ) {
		accountsDto.setAccountNumber(accountsDto.getAccountNumber());
		accountsDto.setAccountType(accounts.getAccountType());
		accountsDto.setBranchAddress(accounts.getBranchAddress());
		return accountsDto;
	}

	public  static Accounts mapToAccount(AccountsDto accountsDto,Accounts accounts){
		accounts.setAccountNumber(accountsDto.getAccountNumber());
        accounts.setAccountType(accountsDto.getAccountType());
        accounts.setBranchAddress(accountsDto.getBranchAddress());
        return accounts;
	}
}
