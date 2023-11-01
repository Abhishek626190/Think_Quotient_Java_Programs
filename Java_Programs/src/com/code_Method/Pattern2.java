package com.code_Method;

import java.util.Scanner;

public class Pattern2 {
	public void check(int num) {
		 
		for (int i =1; i <= num; i++) {
			char ch = 'A';
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
		Pattern2 obj = new Pattern2();
		obj.check(num);
	}

}
