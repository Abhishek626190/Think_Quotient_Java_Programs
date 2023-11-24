package com.Test_Assignments_06_11_2023;

public class Q3_Remove_Duplicate {
	public static void remove(int a[]) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j])
					count++;
			}
		}
		System.out.println(count);
		int arr[] = new int[a.length - count];
		System.out.println(arr.length);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 4, 3, 2, 4, 9, 2 };
		remove(arr);

	}

}
