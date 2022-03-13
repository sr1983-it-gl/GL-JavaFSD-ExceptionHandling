package com.gl.exceptionhandling.multicatchdemo;

public class MultiCatchDemo {

	public static void main(String[] args) {

		try {
			Math.floorDiv(100, 0);
		}catch (ArithmeticException e) {
			
		}
		
		try {			
			
			
			String s = new String("Demo String");
//			s = null;
			
			System.out.println("Length is " + s.length());
			
			int x, y, z;
			
			x = 100;
			y = 0;
			
			z = x/y;
			
			System.out.println("'" + x + "' divided by '" + y + "' is '" + z + "'");
			
		}
		
		catch (NullPointerException npe) {
			
			System.out.println("NullPointer Exception is raised. Check out the program for NULL references");
			npe.printStackTrace();
			
		}catch (ArithmeticException ae) {
			
			System.out.println("ArithmeticException is raised. Check out for the program for values supplied for arithmetic operations");
			ae.printStackTrace();
		}		
		catch (Exception e) {
			
			System.out.println("Exception raised in the program");
			e.printStackTrace();
			
		}
		
		
		
	}
}
