package com.Array_Programs;

public class Array_Demo {
	public void array_Creation() {
		int arr[] = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		System.out.println("lenght of array is:" + arr.length);
		this.displayArray(arr);

	}

	public void displayArray(int array[]) {
		System.out.println(array.length);
		for (int i = 0; i <= array.length - 1; i++) {
			System.out.println(array[i]);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array_Demo obj = new Array_Demo();
		obj.array_Creation();

	}

}
