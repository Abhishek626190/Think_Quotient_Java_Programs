package com.code_Method;

import java.util.Scanner;

public class Satisfy_condition {
	public void check(int num) {
		int org_num = num;
		int rev = 0;

		for (int j = 1; num > 0; j++) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		rev = org_num - rev;
		if (rev < 0)
			System.out.println("0");
		else
			System.out.println(rev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num");
		int num = sc.nextInt();
		Satisfy_condition obj = new Satisfy_condition();
		obj.check(num);

	}

}
