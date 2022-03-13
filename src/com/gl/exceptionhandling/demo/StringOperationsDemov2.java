package com.gl.exceptionhandling.demo;

public class StringOperationsDemov2 {

	public static void main(String[] args) {
		
		stringOperationsDemo();
	}
	
	static void stringOperationsDemo() {
		
		lengthDemo();
		substringDemo();
		containsDemo();
	}
	
	static void lengthDemo() {
		
		System.out.println("BEGIN STRING.LENGTH DEMO");

		String str = new String("Hello");
		str = null;
		System.out.println("Length of '" + str + "' is : " + str.length());

		System.out.println("END STRING.LENGTH DEMO");
		System.out.println();
	}

	private static void substringDemo() {

		System.out.println("BEGIN STRING.SUBSTRING DEMO");

		String str = new String("Hello");

		try {
			int index = 2;
			String result = str.substring(index);
			System.out.println("Substring of '" + str + "' starting from position " 
					+ index + " is '" + result + "'");

			index = 10;
			result = str.substring(index);
			System.out.println("Substring of '" + str + "' starting from position " 
					+ index + " is '" + result + "'");
		} catch (Exception e) {
			System.out.println("Errors have happened as part of substring operation");
			e.printStackTrace();
		}		
	
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
