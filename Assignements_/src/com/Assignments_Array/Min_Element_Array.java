package com.Assignments_Array;

public class Min_Element_Array {

	public static void maxElement(int a[]) {
		int min = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] > min)
				a[i] = min;
			min = a[i];

		}
		System.out.println("in min" + min);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[];
		arr = Sum_Array.createArray();
		maxElement(arr);
	}
}
