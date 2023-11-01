package com.Print_Numbers;

//15. write a program to reverse the given Digits

import java.util.Scanner;

public class Reverse_Number {
	static int num, org_num, rev;

	public void reverse() {
		while (num != 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
	}

	public void display() {
		System.out.println("The reverse of" + num + " is: " + rev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Reverse_Number obj = new Reverse_Number();
		System.out.println("Enter number to get reverse of that number");
		num = sc.nextInt();
		obj.reverse();
		obj.display();
	}

}
