package com.eazybytes.accounts.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatusCode;

@Data
@AllArgsConstructor
public class ResponseDto{
//	 private HttpStatusCode statusCode;
	 private String statusCode;
	 private String statusMsg;


}
