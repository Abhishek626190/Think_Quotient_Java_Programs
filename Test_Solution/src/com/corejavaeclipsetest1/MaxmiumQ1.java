package com.corejavaeclipsetest1;

import java.util.Arrays;

public class MaxmiumQ1 {
	
	public void combine(int arr[]) {
		Arrays.sort(arr);
		int a[] = new int[arr.length];
		int j = 0;
		// System.out.println(Arrays.toString(arr));
		for (int i = arr.length - 1; i >= 0; i--) {
			a[j] = arr[i];
			j++;
		}
		System.out.println("Descending Array");
		System.out.println(Arrays.toString(a));
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum * 10 + a[i];
			// System.out.print(a[i]+",");

		}
		System.out.println(sum);
	}

	public void sortArr(int a[]) {
		int temp = 0;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] < a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

				}
			}
		}
		System.out.println(Arrays.toString(a));
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum * 10 + a[i];
			// System.out.print(a[i]+",");

		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, 2, 8, 9, 6, 8 };
		MaxmiumQ1 obj = new MaxmiumQ1();
		// obj.combine(arr);
		obj.sortArr(arr);

	}

}
