package com.string;

import java.util.Scanner;

public class Fibonacci_Seriea {
	public static int ways(int n) {
		int b = 1, c = 2, d = 0;
		if (n == 0)
			return 1;
		else if (n == 2)
			return 2;
		else if (n == 1)
			return 1;
		else {
			for (int i = 3; i <= n; i++) {
				d = b + c;
				b = c;
				c = d;
			}
			return d;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Stairs");
		int num = sc.nextInt();
		int res = ways(num);
		System.out.println(res);

	}

}
