package com.Print_Numbers;
// 1. Write a program to print all natural numbers from 1 to n
import java.util.*;

public class Natural_numbers {

	static int num;

	public void print() {
		for (int i = 1; i <= num; i++) {
			System.out.print(i + ",");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Natural_numbers obj = new Natural_numbers();
		System.out.println("Enter Nmbers Of Terms You Want To Print Of Natural Numbers");
		num = sc.nextInt();
		obj.print();
	}

}
