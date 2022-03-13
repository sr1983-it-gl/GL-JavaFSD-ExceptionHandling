package com.gl.exceptionhandling.checkedexceptiondemo;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		
		String s1 = "Good";
		String s2 = "Morning";

		try {

			System.out.println(concatenateStrings(s1, s2));

		}catch (Exception e) {
			
			System.out.println("Calling CheckedExceptionDemo.concatenateStrings has resulted in error.");
			e.printStackTrace();
		}		
	}
	
	private static String concatenateStrings(String str1, String str2) 
		throws Exception{
		
		if (str1 == null || str2 == null) {
			
			throw new Exception("String cannot be null. Check the value of string objects");
		}
		
		return str1 + " " + str2;
		
	}
	
}
