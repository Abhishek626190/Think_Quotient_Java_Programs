package com.Print_Numbers;

//21. Write a program to find number and sum of all integer between 100 and 200 which are divisible by 9
public class Integer_Number_sum {
	static int sum = 0;

	public void display() {
		System.out.println("The integer numbers from 100 to 200 are:\n");

		for (int i = 100; i <= 200; i++) {
			System.out.print(i + ",");

			sum = sum + i;
		}
		System.out.println("\n");
		System.out.println("The of integer number from 100 to 200 is: " + sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer_Number_sum obj = new Integer_Number_sum();
		obj.display();

	}

}
