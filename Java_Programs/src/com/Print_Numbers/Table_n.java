package com.Print_Numbers;
//3. Write a program to print tables
import java.util.Scanner;

public class Table_n {

	static int num;

	public void print() {
		for (int i = 1; i <= 10; i++) {
			System.out.println((num * i + "\n"));
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Table_n obj = new Table_n();
		System.out.println("Enter number to print table of that number:");
		num = sc.nextInt();
		System.out.println("The table of " + num + " is:\n");
		obj.print();

	}

}
