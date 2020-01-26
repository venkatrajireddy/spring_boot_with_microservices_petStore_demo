package com.petstore.petstoreDemo.exception;


public class PetNotFound extends  RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public PetNotFound(String message)
	{
		super(message);
	}

}
