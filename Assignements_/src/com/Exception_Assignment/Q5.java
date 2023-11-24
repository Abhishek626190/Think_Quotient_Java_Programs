package com.Exception_Assignment;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main starts");
		try {
			int a=10/0;
			System.out.println(a);
		}
//		catch(ArithmeticException e)
//		{
//			e.printStackTrace();
//		}
		finally
		{
			System.out.println("I am in finally block");
		}
		System.out.println("Main Ends");


	}

}
