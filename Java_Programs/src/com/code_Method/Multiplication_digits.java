package com.code_Method;

import java.util.*;

public class Multiplication_digits {
	public void mul(int num) {
		int multiply = 1;
		for (int i = 1; num > 0; i++) {
			int rem = num % 10;
			num = num / 10;
			multiply = multiply * rem;
		}
		System.out.println(multiply + ":Is the multiplication of digit");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		Multiplication_digits obj = new Multiplication_digits();
		obj.mul(num);

	}
}
