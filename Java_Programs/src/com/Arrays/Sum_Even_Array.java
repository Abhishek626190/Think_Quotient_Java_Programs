package com.Arrays;
//3> print all even numbers from array
public class Sum_Even_Array {
	public static void sumEven(int a[]) {
		int sum = 0;
		System.out.println("The Sum of even elments of array are:");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				sum = sum + a[i];
			}
		}
		System.out.println(sum);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[];
		arr = Sum_Array.createArray();
		sumEven(arr);

	}

}
