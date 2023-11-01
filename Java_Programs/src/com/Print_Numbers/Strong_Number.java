package com.Print_Numbers;

import java.util.Scanner;

public class Strong_Number {
	static int num, rem, org_num, sum = 0, factorial ;

	public void check() {
		org_num = num;
		do {
			int i = 1;
			int rem = num % 10;
			factorial=1;
			while (i <= rem) {
				factorial = factorial * i;
				i++;

			}
			num = num / 10;
			sum = sum + factorial;
		} while (num != 0);
		if (sum == org_num)
			System.out.println("The " + org_num + " is a Strong Number:");
		else
			System.out.println("The " + org_num + " is not a Strong Number:");

	}

	public void display() {
//		if (sum == org_num)
//			System.out.println("The " + org_num + " is a Strong Number:");
//		else
//			System.out.println("The " + org_num + " is not a Strong Number:");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Strong_Number obj = new Strong_Number();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		num = sc.nextInt();
		obj.check();
		obj.display();

	}

}
