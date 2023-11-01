package com.Array_Programs;

public class Array_for_each {
	public void setArray() {
		int array[] = { 5, 10, 15, 20, 25 };
		System.out.println("We are in setArray");
		System.out.println("lenght of array is:" + array.length);
		this.displayArray(array);
	}

	public void displayArray(int a[]) {
		System.out.println("We are in displayArray");
		for (int i : a) {
			System.out.println(a[i]);
		}
		System.out.println("*****");
		System.out.println("lenght of array is:" + a.length);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array_for_each obj = new Array_for_each();
		obj.setArray();

	}

}
