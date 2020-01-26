package com.petstore.petstoreDemo.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestController
@ControllerAdvice
public class ExceptionHandlerControllerAdvice extends ResponseEntityExceptionHandler  {
	
	
	  @ExceptionHandler(PetNotFound.class)
	  @ResponseStatus(value = HttpStatus.NOT_FOUND)
	  public ResponseEntity<ExceptionResponse> exception(PetNotFound exception) {
		  ExceptionResponse response= new ExceptionResponse(HttpStatus.NOT_FOUND,"Not found",exception.getMessage());
		 return new ResponseEntity(response, HttpStatus.NOT_FOUND);
	  }
	  @ExceptionHandler(BadRequest.class)
	  public ResponseEntity<ExceptionResponse> exception(BadRequest exception) {
		  return new ResponseEntity(exception.getMessage(), HttpStatus.BAD_REQUEST);
	  }
	  @ExceptionHandler(Exception.class)
	  public ResponseEntity<ExceptionResponse> exception(Exception exception) {
		  return new ResponseEntity(exception.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	  }
}

