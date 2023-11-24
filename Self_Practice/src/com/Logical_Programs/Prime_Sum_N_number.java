package com.Logical_Programs;

import java.util.Scanner;

public class Prime_Sum_N_number {

	public boolean prime(int n) {
		int count = 0;

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				count++;
				break;
			}
		}
		if (count == 0) {
			return true;
		} else
			return false;
	}

	public void sum(int n) {
		int sum = 0;
		int cnt = 0;

		for (int i = 2; cnt < n; i++) {
			if (prime(i)) {
				sum = sum + i;
				cnt++;
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter term");
		int term = sc.nextInt();
		Prime_Sum_N_number obj = new Prime_Sum_N_number();
		obj.sum(term);

	}

}
