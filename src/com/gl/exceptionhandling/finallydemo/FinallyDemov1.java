package com.gl.exceptionhandling.finallydemo;

import java.util.Scanner;

public class FinallyDemov1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number: ");				
		int number1 = scanner.nextInt();
		
		System.out.println("Enter another number: ");
		int number2 = scanner.nextInt();
		
		try {
			int result = number1 / number2;		
			System.out.println("Result is '" + result + "'");			
			scanner.close();
		}catch (ArithmeticException exception) {
			
			System.out.println("ArithmeticException is raised. "
			+ "Check out for the program for values supplied "
				+ "for arithmetic operations");
		}
	}
}
