package com.petstore.petstoreDemo.exception;

import org.springframework.http.HttpStatus;

import lombok.Data;

@Data
public class ExceptionResponse {
	
	private String message;
	private String error;
	private HttpStatus status;
	
	public ExceptionResponse(HttpStatus status, String message, String error)
	{
		super();
		this.status= status;
		this.message= message;
		this.error=error;
		
	}

}
