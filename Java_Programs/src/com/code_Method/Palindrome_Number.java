package com.code_Method;

import java.util.*;

public class Palindrome_Number {
	public void check(int num) {
		int org_num = num;
		int rev = 0;
		for (int i = 1; num > 0; i++) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		if (rev == org_num) {
			System.out.println(org_num + ":Is Palindrome Number");
		} else
			System.out.println(org_num + ":Is Not Palindrome Number");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		Palindrome_Number obj = new Palindrome_Number();
		obj.check(num);

	}

}
