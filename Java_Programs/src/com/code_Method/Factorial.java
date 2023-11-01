package com.code_Method;

public class Factorial {
	public int calculate_Factorial(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial obj = new Factorial();
		int res = obj.calculate_Factorial(5);
		System.out.println(res);
	}

}
