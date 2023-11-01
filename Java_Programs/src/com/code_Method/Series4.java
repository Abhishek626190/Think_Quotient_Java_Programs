package com.code_Method;

import java.util.*;

public class Series4 {
	public void series(int terms) {
		int num1 = 3;
		System.out.print(num1 + ",");
		for (int i = 2; i < terms; i=i+2) {

			int res = num1 * 3;

			System.out.print(res + ",");
			int num2 = res + 1;

			System.out.print(num2 + ",");
			num1 = num2;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Terms In Odd Number: ");
		int num = sc.nextInt();
		Series4 obj = new Series4();
		obj.series(num);

	}

}
