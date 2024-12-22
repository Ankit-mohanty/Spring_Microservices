package com.eazybytes.accounts.controller;

import com.eazybytes.accounts.DTO.CustomerDto;
import com.eazybytes.accounts.DTO.ResponseDto;
import com.eazybytes.accounts.constants.AccountsConstant;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class AccountsController {

	@PostMapping("/create")
	public ResponseEntity<ResponseDto> createAccount(
			@RequestBody CustomerDto customerDto
	                                                ) {

		/*return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseDto(HttpStatusCode.valueOf(201), "Created"));*/
		return ResponseEntity
				.status(HttpStatus.CREATED)
				.body(new ResponseDto(AccountsConstant.STATUS_201, AccountsConstant.MESSAGE_201));
	}
}