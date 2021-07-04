package com.assignment;
import java.util.Scanner;

public class Shape {
	private static int length, width;
	
	private boolean isSquare() {
		return length == width;
	}
	
	public static void main(String[] args) throws NotASquareException {
		Scanner sc = new Scanner(System.in);
		Shape shapeObj = new Shape();
		System.out.println("Kindly enter the length and width: ");
		
		length = sc.nextInt();
		width = sc.nextInt();
		sc.close(); 
	
		if(shapeObj.isSquare()) 
			System.out.println("\nIt is a square!");
		else {
			System.out.println("\nNote: an exception will be thrown now as the figure is not a square");
			throw new NotASquareException("\nNot a square!");
		}
			
	}
	
}
