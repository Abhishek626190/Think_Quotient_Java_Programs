package com.code_Method;

import java.util.Scanner;

public class Pattern1 {
	public void check(char num) {
		for (char i = 'A'; i <= num; i++) {
			for (char j = 'A'; j <= i; j++) {
				if (j <= i)
					System.out.print(j);
				else
					System.out.print("");
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character");
		char num = sc.next().charAt(0);
		Pattern1 obj = new Pattern1();
		obj.check(num);
	}

}
