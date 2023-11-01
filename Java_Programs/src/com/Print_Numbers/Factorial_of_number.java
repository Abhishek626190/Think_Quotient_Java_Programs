package com.Print_Numbers;

//13. Write a program to find the factorial value of any number

import java.util.Scanner;

public class Factorial_of_number {

	static int factorial = 1, num;

	public void print() {

		for (int i = 1; i <= num; i++) {

			factorial = factorial * i;
		}
	}

	public void displays() {
		System.out.println("The factorial of " + num + " is=" + factorial);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial_of_number obj = new Factorial_of_number();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to find factorial of that number");
		num = sc.nextInt();
		obj.print();
		obj.displays();

	}

}
