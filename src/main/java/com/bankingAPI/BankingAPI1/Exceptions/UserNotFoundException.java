package com.bankingAPI.BankingAPI1.Exceptions;

public class UserNotFoundException extends Exception{

	private static final long serialVersionUID = 3366147921621744508L;
	public UserNotFoundException(String msg){
		super(msg);
	}
}
