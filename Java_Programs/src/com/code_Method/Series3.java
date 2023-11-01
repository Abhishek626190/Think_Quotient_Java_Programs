package com.code_Method;

import java.util.Scanner;

public class Series3 {
	public void series(int terms)
	{
		int num1 = terms;
		System.out.print(terms + ",");
		for (int i = 1; i < terms; i++) {
			int table = i * 4;
			int res = table + num1;
			System.out.print(res + ",");
			num1 = res;

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		Series3 obj=new Series3();
		obj.series(num);
		

	}

}
