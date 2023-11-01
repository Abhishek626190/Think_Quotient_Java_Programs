package com.Assignments_Array;
//1> Print array in reverse order
public class Print_Reverse_Array {
	public static void reverseArray(int a[]) {
		System.out.println("The array elements in revrse order");
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + ",");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[];
		arr = Sum_Array.createArray();
		reverseArray(arr);
 		Sum_Array.printArray(arr);

	}

}
