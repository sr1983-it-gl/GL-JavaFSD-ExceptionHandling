package com.gl.exceptionhandling.uncheckedexceptiondemo;

public class UncheckedExceptionDemo {

	public static void main(String[] args) {
		
		String s1 = "Good";
		String s2 = "Morning";

		System.out.println(concatenateStrings(s1, s2));
	}
	
	private static String concatenateStrings(String str1, String str2) 
		//throws RuntimeException
		{
		
		if (str1 == null || str2 == null) {
			
			throw new RuntimeException("String cannot be null. Check the value of string objects");
		}
		
		return str1 + " " + str2;
		
	}
	
}
