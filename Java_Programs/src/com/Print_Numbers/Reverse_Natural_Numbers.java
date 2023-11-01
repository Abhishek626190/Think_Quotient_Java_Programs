package com.Print_Numbers;

//2. Write a program to print all natural numbers in reverse

import java.util.Scanner;

public class Reverse_Natural_Numbers {

	static int num;

	public void print() {
		for (int i = 1; num >= i; num--) {
			System.out.print(num + ",");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Reverse_Natural_Numbers obj = new Reverse_Natural_Numbers();
		System.out.println("Enter Nmbers Of Terms You Want To Print Of Natural Numbers In Reverse");
		num = sc.nextInt();
		obj.print();
	}
}
