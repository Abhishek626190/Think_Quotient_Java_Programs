package com.TEST_Assignments23_10_2023;

import java.util.Scanner;

public class Prime_Number_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting number");
		int num1 = sc.nextInt();
		System.out.println("Enter Ending number");
		int num2 = sc.nextInt();
		int count = 0;
		for (; num1 <= num2; num1++) {
			count = 0;
			for (int i = 2; i < num1; i++) {
				if (num1 % i == 0) {
					count++;
					break;
				}
			}
			if (count == 0)
				System.out.println(num1);

		}

	}

}
