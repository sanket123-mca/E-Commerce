package com.wipro.bankofamerica.estore.exception;

public class AddressNotFoundException extends RuntimeException 
{
	private String message;

	public String getMessage() {
		return message;
	}

	public AddressNotFoundException(String message) {
		super();
		this.message = message;
	}

	
	
	
}
