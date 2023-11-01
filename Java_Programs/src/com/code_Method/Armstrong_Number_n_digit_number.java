package com.code_Method;

import java.util.Scanner;

public class Armstrong_Number_n_digit_number {
	public int count(int num) {
		int count = 0;
		while (num != 0) {
			num = num / 10;
			count++;
		}
		return count;
	}

	public int power(int b, int e) {
		int power = 1;
		for (int i = 1; i <= e; i++) {
			power = power * b;
		}
		return power;
	}

	public boolean check(int num) {
		int cnt = count(num);
		int sum = 0;
		int temp = num;
		for (int i = 1; num != 0; i++) {
			int rem = num % 10;
			num = num / 10;
			sum = sum + power(rem, cnt);
		}
		if (sum == temp)
			return true;
		else
			return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Armstrong_Number_n_digit_number obj = new Armstrong_Number_n_digit_number();
		System.out.println("Please Enter Digit Number Only");
		int num = sc.nextInt();
		boolean res = obj.check(num);
		if (res == true)
			System.out.println(num + " Is Armstrong number");
		else
			System.out.println(num + " Is Not Armstrong number");

	}

}
