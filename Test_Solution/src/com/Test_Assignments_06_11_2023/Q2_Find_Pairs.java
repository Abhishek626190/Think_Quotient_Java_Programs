package com.Test_Assignments_06_11_2023;

public class Q2_Find_Pairs {
	public static void pair(int a[]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				
					if (a[i] + a[j] == 10) {
						System.out.println("The sum of:" + a[i] + "+" + a[j] + "=" + (a[i] + a[j]));
					
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 4, 6, 5, -10, 8, 5, 20 };
		pair(arr);

	}

}
