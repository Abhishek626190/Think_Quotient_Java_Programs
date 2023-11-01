package com.do_while_loop;

import java.util.Scanner;

public class Decreasing_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int rem1 = num % 10;
		int count = 0;
		while (num > 0) {
			int rem2 = num % 10;
			if (rem2 < rem1)
				count++;
			rem1 = rem2;
			num = num / 10;
		}
		if (count == 0)
			System.out.println("Decreasing Order");
		else
			System.out.println("Non Decereasing Order");
	}

}
