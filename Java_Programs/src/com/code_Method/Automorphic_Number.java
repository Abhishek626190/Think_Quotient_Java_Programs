package com.code_Method;

import java.util.*;

public class Automorphic_Number {
	public void check(int num) {
		int count = 0;
		int org_num = num;
		while (num != 0) {
			num = num / 10;
			count++;
		}
		int power = 1;
		for (int i = 1; i <= count; i++) {
			power = power * 10;
		}
		int square = org_num * org_num;
		square = square % power;
		if (square == org_num)
			System.out.println(org_num + ":Is a Automorphic Number");
		else
			System.out.println(org_num + ":Is not a Automorphic Number");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		Automorphic_Number obj = new Automorphic_Number();
		obj.check(num);

	}

}
