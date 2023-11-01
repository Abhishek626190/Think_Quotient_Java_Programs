package com.TEST_Assignments23_10_2023;

import java.util.Scanner;

public class Disarum_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num");
		int num = sc.nextInt();
		int temp = num;
		int count = 0;
		int sum = 0;
		while (num != 0) {
			num = num / 10;
			count++;
		}

		for (int i = 0; temp != 0; i++) {
			int power = 1;
			int rem = temp % 10;
			int count1 = count;
			for (int j = 1; count1 > 0; j++) {

				power = rem * power;

				count1--;

			}
			sum = sum + power;
			temp = temp / 10;
			count--;
		}
		System.out.println(sum);
		sc.close();

	}

}
