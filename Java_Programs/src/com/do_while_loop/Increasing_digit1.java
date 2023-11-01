package com.do_while_loop;

import java.util.Scanner;

public class Increasing_digit1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int rem1 = num % 10;
		int count = 0;
		while (num > 0) {
			int rem2 = num % 10;
			if (rem2 > rem1) {
				count = count + 1;
			}
			rem1 = rem2;
			num = num / 10;

		}
		if (count == 0)
			System.out.println("Increasing order");
		else
			System.out.println("Non Increasing order");
	}

}
