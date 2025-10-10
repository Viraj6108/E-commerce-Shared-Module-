package com.webdev.ws.errors;

public class NotRetryableException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NotRetryableException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public NotRetryableException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	
	
}
