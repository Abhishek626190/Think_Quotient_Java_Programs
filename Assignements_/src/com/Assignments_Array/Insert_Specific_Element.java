package com.Assignments_Array;

import java.util.Scanner;

public class Insert_Specific_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4 };
		System.out.println("The elements are ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter element to insert");
		int ele = sc.nextInt();
		System.out.println("Enter Position to insert");
		int pos = sc.nextInt();
		arr[pos - 1] = ele;
		System.out.println("The elements after insert are: ");
 		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}

	}

}
