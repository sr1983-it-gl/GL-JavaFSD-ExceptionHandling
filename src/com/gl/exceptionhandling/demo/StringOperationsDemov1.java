package com.gl.exceptionhandling.demo;

public class StringOperationsDemov1 {

	public static void main(String[] args) {
		
		stringOperationsDemo();
	}
	
	private static void stringOperationsDemo() {
		
		lengthDemo();
		substringDemo();
		containsDemo();
	}
	
	private static void lengthDemo() {
		
		System.out.println("BEGIN STRING.LENGTH DEMO");

		String str = new String("Hello");
		System.out.println("Length of '" + str + "' is : " + str.length());

		System.out.println("END STRING.LENGTH DEMO");
		System.out.println();
	}

	private static void substringDemo() {

		System.out.println("BEGIN STRING.SUBSTRING DEMO");

		String str = new String("Hello");

		int index = 2;
		String result = str.substring(index);
		System.out.println("Substring of '" + str + "' starting from position " 
				+ index + " is '" + result + "'");

		index = 10;
		result = str.substring(index);
		System.out.println("Substring of '" + str + "' starting from position " 
				+ index + " is '" + result + "'");		
	
		System.out.println("END STRING.SUBSTRING DEMO");	
		System.out.println();
	}

	private static void containsDemo() {
		
		System.out.println("BEGIN STRING.CONTAINS DEMO");
		
		String str = new String("Hello");
		String stringToCheck = "e";
		boolean result = str.contains(stringToCheck);
		
		System.out.println("'" + str + "' contains '" + stringToCheck + "' : " + result);

		stringToCheck = "a";
		result = str.contains(stringToCheck);
		System.out.println("'" + str + "' contains '" + stringToCheck + "' : " + result);
	
		System.out.println("END STRING.CONTAINS DEMO");
		System.out.println();
	
	}
	
}
