package com.Assignments_Array;

import java.util.Scanner;

public class Insert_Specific_Element_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5 };
		System.out.println("The elements are ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		int newarr[] = new int[arr.length + 1];
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter element to insert");
		int ele = sc.nextInt();
		System.out.println("Enter Position to insert");
		int pos = sc.nextInt();
		for (int i = 0; i < pos-1; i++) {
			newarr[i] = arr[i];
		}
		newarr[pos-1] = ele;
		for (int i = pos-1; i < arr.length; i++) {
			newarr[i + 1] = arr[i];
		}
		for (int i = 1; i < newarr.length; i++) {
			System.out.print(newarr[i] + ",");
		}

	}

}
