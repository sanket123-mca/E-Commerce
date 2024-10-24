package com.wipro.bankofamerica.estore.exception;


public class InvalidCredentialsException extends RuntimeException
{

	private String message ;


	public InvalidCredentialsException(String message)
	{
		super();
		this.message = message;
	}


	@Override
	public String getMessage() {
		return message;
	}



}
