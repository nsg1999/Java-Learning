package com.assignment;

public class arrayCatchAndReset {
	public static void main(String[] args) {
		int[] arr = new int[10];
    int indexPointer = 11;
    
		try {
			arr[indexPointer] = 49;
		}
    
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("An exception has been caught, it says - \"" + e.getMessage() + "\"");
		}
    
		finally {
			indexPointer = arr.length - 1;
			System.out.println("Now, the indexPointer points to - " + indexPointer);
		}
	}
}
