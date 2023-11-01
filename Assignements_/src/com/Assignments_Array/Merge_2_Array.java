package com.Assignments_Array;

public class Merge_2_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = Sum_Array.createArray();
		int arr1[] = Sum_Array.createArray();
		int sumArr[] = new int[arr.length + arr1.length];
		for (int i = 0; i < arr.length; i++) {
			sumArr[i] = arr[i];
		}
		for (int i = arr.length, j = 0; j < arr1.length; i++) {
			sumArr[i] = arr1[j];
			j++;
		}
		System.out.println("The merge array is :");
		for (int i = 0; i < sumArr.length; i++) {
			System.out.print(sumArr[i] + ",");
		}

	}

}
