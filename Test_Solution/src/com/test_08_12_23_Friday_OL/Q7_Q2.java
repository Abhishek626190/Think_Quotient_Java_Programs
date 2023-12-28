package com.test_08_12_23_Friday_OL;

public class Q7_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		for (int i = 0; i < arr.length; i = incrementCounter(i)) {
			System.out.println(i);
		}

	}

	private static int incrementCounter(int i) {
		return ++i;
	}
}
