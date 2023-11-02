package com.Arrays_1D;

// create array and access array of element
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create array with the help of new
		int num[] = new int[5];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;
		// System.out.println(num[0]+"*****");
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		System.out.println("***********************");
		// create array with first class object
		int num1[] = { 5, 10, 15, 20, 25 };
		for (int i = 0; i < num1.length; i++) {
			System.out.println(num1[i]);
		}

	}

}
