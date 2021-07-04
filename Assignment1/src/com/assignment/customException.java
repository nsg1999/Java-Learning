package com.assignment;

public class customException extends NullPointerException{

	public customException(String string) {
		System.out.println("Custom Exception: "+string );
	}

}
