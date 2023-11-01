package com.code_Method;

import java.util.Scanner;

public class Series2 {
	public void series(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.print(",");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Terms");
		int num = sc.nextInt();
		Series2 obj = new Series2();
		obj.series(num);

	}

}
