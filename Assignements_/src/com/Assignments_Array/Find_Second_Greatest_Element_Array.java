package com.Assignments_Array;

public class Find_Second_Greatest_Element_Array {
	public static void sortArr(int a[]) {
		int temp = 0;

 		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

				}
			}
		}
//		System.out.println("Array in Ascending Order:");
//		for (int i = 0; i < a.length; i++) {
//			//System.out.print(a[i] + ",");
//		}
		System.out.println("\nThe 2nd greatest element is :" + a[a.length - 2]);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = Sum_Array.createArray();
		sortArr(arr);

	}

}
