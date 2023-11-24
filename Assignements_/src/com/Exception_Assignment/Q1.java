package com.Exception_Assignment;

public class Q1 {
	public static void show(int a[]) {
		try {
			for (int i = 0; i <= a.length; i++) {
				System.out.print(a[i] + ",");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		for (int e : a) {
			System.out.print(e + ",");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5 };
		show(arr);
		System.out.println("\nMain ends");

	}

}
