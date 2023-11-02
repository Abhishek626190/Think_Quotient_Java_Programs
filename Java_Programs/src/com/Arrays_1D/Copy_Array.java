package com.Arrays_1D;

import java.util.Arrays;

public class Copy_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 8, 5 };
		int arr1[] = new int[5];
		// copy array with arraycopy method
		System.arraycopy(arr, 0, arr1, 0, 5);

		System.out.println(Arrays.toString(arr));

		System.out.println(Arrays.toString(arr1));

	}

}
