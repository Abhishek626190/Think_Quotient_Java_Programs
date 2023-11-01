package com.Assignments_Array;

public class Copy_Array {
	public static void copyArray(int a[]) {
		int copy[] = new int[a.length];
		System.out.println("The original array is:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
			copy[i] = a[i];
		}
		System.out.println("\nThe copied array is :");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + ",");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[];
		arr = Sum_Array.createArray();
		copyArray(arr);

	}

}
