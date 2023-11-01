package com.Print_Numbers;
//14. Write a program to find the value of one number raised to the power of another
import java.util.Scanner;

public class Calculate_Power {

	static int expo , base,power=1;

	public void print() {

		for (int i = 1; i <=expo; i++) {

			 power=base*power;
		}
	}

	public void displays() {
		System.out.println("The factorial of " + base + " is=" + power);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate_Power obj = new Calculate_Power();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Base to find power");
		base = sc.nextInt();
		System.out.println("Enter Exponent to find power");
		expo = sc.nextInt();
		obj.print();
		obj.displays();

	}

}
