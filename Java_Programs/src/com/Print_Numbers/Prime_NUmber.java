package com.Print_Numbers;

import java.util.Scanner;

public class Prime_NUmber {
	static int num, count = 0;

	public void check() {
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				count = 1;

		}
	}

	public void display() {
		if (count == 0)
			System.out.println(num + " is a Prime number");
		else
			System.out.println(num + " is not a Prime number");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		num = sc.nextInt();
		Prime_NUmber obj = new Prime_NUmber();
		obj.check();
		obj.display();

	}

}
