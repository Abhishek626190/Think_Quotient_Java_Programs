package com.code_Method;

import java.util.Scanner;

public class Prime_number_series {
	public void check(int num)
	{
		int count;
		for (int i = 2; i < num; i++) {
			count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count = 1;

				}
			}
			if (count == 0)
				System.out.println(i);
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		Prime_number_series obj=new Prime_number_series();
		obj.check(num);
		

	}

}
