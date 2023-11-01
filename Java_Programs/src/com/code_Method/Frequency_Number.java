package com.code_Method;

import java.util.Scanner;

public class Frequency_Number {
	public void check(int num) {
		int count;

		for (int i = 0; i <= 9; i++) {
			count = 0;
			int temp = num;
			while (temp > 0) {
				int rem = temp % 10;

				if (rem == i)
					count++;
				temp = temp / 10;

			}
			if (count > 0)
				System.out.println(i + ":" + count + " times");

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		Frequency_Number obj = new Frequency_Number();
		obj.check(num);

	}

}
