package com.Exception_Assignment;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 5 / 0;
			System.out.println(a);
		}
//		catch() //we can not have an empty catch block
//		{
//			System.out.println("I am in catch");
//		}
		catch (ArithmeticException e) {
			e.printStackTrace();
		}

	}

}
