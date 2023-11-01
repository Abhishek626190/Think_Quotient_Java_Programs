package com.code_Method;

import java.util.Scanner;

public class Even_Odd {
	public void check(int num) {
		if (num % 2 == 0)
			System.out.println(num + ":IS an Even Number");
		else
			System.out.println(num + ":Is a Odd Number");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		Even_Odd obj = new Even_Odd();
		obj.check(num);

	}

}
