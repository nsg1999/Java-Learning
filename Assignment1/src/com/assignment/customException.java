package com.assignment;

public class customException extends NullPointerException{
	public customException(String errorMessage) {
		System.out.println("Custom Exception: "+ errorMessage);
	}

}
