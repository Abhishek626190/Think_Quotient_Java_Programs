package com.Print_Numbers;
//4. Write a program to print reverse tables
import java.util.Scanner;

public class Reverse_table_n {
	static int num;

	public void print() {
		for (int i = 10; i >= 1; i--) {
			System.out.println((num * i + "\n"));
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Reverse_table_n obj = new Reverse_table_n();
		System.out.println("Enter number to print table of that number:");
		num = sc.nextInt();
		System.out.println("The table of " + num + " is:\n                                                                                   ");
		obj.print();

	}

}
