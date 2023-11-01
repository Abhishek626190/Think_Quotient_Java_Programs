package com.Print_Numbers;
//19. Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered

import java.util.Scanner;

public class Positive_negative_zero {
	Scanner sc = new Scanner(System.in);

	static int num, positive = 0, negative = 0, zero = 0;
	static char ch;

	public void input() {
		for (int i = 1; true; i++) {
			System.out.println("Enter_Number");
			num = sc.nextInt();
			if (num > 0)
				positive = positive + 1;
			else if (num < 0)
				negative = negative + 1;
			else if (num == 0)
				zero = zero + 1;
			System.out.println("For Continue: Press 'Y' & For Stop: Press 'N");
			ch = sc.next().charAt(0);
			if (ch == 'N' || ch == 'n')
				break;
			else
				continue;

		}
	}

	public void display() {
		System.out.println("Positive Number Entered By U:" + positive);
		System.out.println("Positive Number Entered By U:" + negative);
		System.out.println("Positive Number Entered By U:" + zero);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Positive_negative_zero obj = new Positive_negative_zero();
		obj.input();
		obj.display();

	}

}
