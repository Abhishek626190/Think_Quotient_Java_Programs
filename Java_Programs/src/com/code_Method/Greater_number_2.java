package com.code_Method;

import java.util.Scanner;

public class Greater_number_2 {
	public void check(int num1, int num2) {
		if (num1 > num2)
			System.out.println(num1 + ":Is greater number");
		else
			System.out.println(num2 + ":Is greater number");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int num1 = sc.nextInt();
		System.out.println("Enter second number");
		int num2 = sc.nextInt();
		Greater_number_2 obj = new Greater_number_2();
		obj.check(num1, num2);

	}

}
