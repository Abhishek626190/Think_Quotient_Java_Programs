package com.Test_Assignments_06_11_2023;

public class Q1_Count_Even_Odd {
	public static void count(int a[]) {
		int counteven = 0, countodd = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0)
				counteven++;
			else if (a[i] % 2 != 0)
				countodd++;
		}
		System.out.println("Count Of Even Elements is:" + counteven);
		System.out.println("Count Of Odd Elements is:" + countodd);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 3, 1, 4, 6, 8, 9, 7, 5 };
		count(arr);

	}

}
