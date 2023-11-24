package com.Exception_Assignment;

import java.util.Arrays;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Abhishek";
//		String s[]= {"abhi","abhishek"};
//		char s1[]=s.toCharArray();
		try {

			for (int i = 0; i <= s.length(); i++) {
				System.out.print(s.charAt(i) + ",");
			}
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("\nIn string");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("In array");
			e.printStackTrace();
		} finally {
			System.out.println("I am in string finally block");
		}
		System.out.println("*******************");
		try {
			int arr[] = { 1, 2, 3, 4, 5 };
			for (int i = 0; i <= arr.length; i++) {
				System.out.print(arr[i] + ",");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("\nIn Array");
 			e.printStackTrace();
		} finally {
			System.out.println("\nI am in Array finally block");
		}
		System.out.println("Main Ends");

	}

}
