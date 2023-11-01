package com.Array_Programs;

public class Reverse_Array {
	public void arrayCreation() {
		int arr[] = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		System.out.println("lenght of array is:" + arr.length);

		displayArray(arr);
	}

	public void displayArray(int array[]) {
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}
		System.out.println("********");
		System.out.println(array.length);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse_Array obj = new Reverse_Array();
		obj.arrayCreation();
	}
}
