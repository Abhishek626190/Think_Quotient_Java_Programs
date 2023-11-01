package com.code_Method;

import java.util.Scanner;

public class Series1 {
	public void series(int terms) {
		int num1 = 1;
		int num2 = 3;

		System.out.print(num1 + "," + num2 + ",");
		for (int i = 3; i <= terms; i++) {
			int sum = num2 - num1;

			int sum1 = sum * 2;
			sum1 = sum1 + num2;
			System.out.print(sum1 + ",");
			num1 = num2;
			num2 = sum1;

		}
		
//		int num5=0;
//		for(int i=1;i<=5;i++)
//		{
//			 int num4=num5*2+1;
//			 System.out.println(num5);
//			 num5=num4;
//			 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num");
		int num = sc.nextInt();
		Series1 obj = new Series1();
		obj.series(num);

//			 
//			
//		}

	}

}
