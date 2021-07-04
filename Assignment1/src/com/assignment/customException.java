package com.assignment;

public class customException extends NullPointerException{
	public customException(String str) {
		System.out.println("Custom Exception: "+ str);
	}

}
