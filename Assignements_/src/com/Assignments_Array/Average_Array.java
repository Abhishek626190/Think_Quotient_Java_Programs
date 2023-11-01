package com.Assignments_Array;

//5>find avg of array element
public class Average_Array {
	public static void average(int a[]) {
		int sum = 0;
		float avg;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		avg = sum / a.length;
		System.out.println(avg);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[];
		arr = Sum_Array.createArray();
		average(arr);

	}

}
