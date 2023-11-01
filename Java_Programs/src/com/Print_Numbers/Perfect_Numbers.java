package com.Print_Numbers;
// Write a Program to check perfect numbers or Not
import java.util.Scanner;

public class Perfect_Numbers {

	static int num, sum = 0;

	public void check() {

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i);
				if (sum != num)
					sum = sum + i;
			}

		}
	}

	public void display() {
		if (sum == num)
			System.out.println(num + ":Is Perfect_Number");

		else
			System.out.println(num + ":Is not Perfect_Number");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Perfect_Numbers obj = new Perfect_Numbers();
		System.out.println("Enter Number:");
		num = sc.nextInt();
		obj.check();
		obj.display();
	}

}
