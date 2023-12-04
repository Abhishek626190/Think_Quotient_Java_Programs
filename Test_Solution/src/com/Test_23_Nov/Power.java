package com.Test_23_Nov;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Base");
		int base = sc.nextInt();
		System.out.println("Enter Exponent");
		int expo = sc.nextInt();
		int power = 1;
		for (int i = 1; i <= expo; i++) {
			power = power * base;
		}
		System.out.println("The Result Is " + power);
	}

}
