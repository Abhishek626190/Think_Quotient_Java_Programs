package com.test_01_12_23;

import java.util.ArrayList;
import java.util.Arrays;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 15, 25, 35, 5 };
		System.out.println("Array:" + Arrays.toString(arr));
		ArrayList<Integer> al = new ArrayList<>();
		// System.out.println("Converting Array To ArrayList");
		for (int i = 0; i < arr.length; i++) {
			al.add(arr[i]);
		}
		System.out.println("ArrayList:" + al);
		System.out.println("*************");
		ArrayList<Integer> al1 = new ArrayList<>();
		al1.add(10);
		al1.add(20);
		al1.add(40);
		al1.add(30);
		al1.add(50);
		System.out.println("ArrayList:" + al1);
		// System.out.println("Converting ArrayList To Array");
		int arr1[] = new int[al1.size()];
		int i = 0;
		for (int l : al1) {
			arr1[i] = l;
			i++;
		}
		System.out.println("Array:" + Arrays.toString(arr1));

	}

}
