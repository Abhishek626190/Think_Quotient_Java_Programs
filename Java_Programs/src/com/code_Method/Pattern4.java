package com.code_Method;

import java.util.Scanner;

public class Pattern4 {
	public void check(int num) {
		char ch = 'A';
		for (int i = 1; i <= num; i++) {

			for (int j = 1; j <= i; j++) {
				if (j <= i) {
					System.out.print(ch++);

				} else
					System.out.print("");
			}

			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		Pattern4 obj = new Pattern4();
		obj.check(num);
	}

}
