package com.Print_Numbers;
//20. Write a program to enter the numbers till the user wants and 
//at the end the program should display the largest and smallest numbers entered
import java.util.*;

public class Maximum_Number {
	Scanner sc = new Scanner(System.in);
	static int num, max,min;
	static char ch;

	public void check() {
		System.out.println("Enter number");
		num = sc.nextInt();
		max = num;
		do {
			System.out.println("For Continue: Press 'Y' & For Stop: Press 'N'");
			ch = sc.next().charAt(0);
			if (ch == 'N' || ch == 'n')
				break;
			else {
				System.out.println("Enter number");
				num = sc.nextInt();
			}
			if (num > max)
				max = num;
			else
				min=num;

		} while (true);
	}

	public void display() {
		System.out.println("Largest Number Is:" + max);
		System.out.println("Smallest Number Is:" + min);


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maximum_Number obj=new Maximum_Number();
		obj.check();
		obj.display();

	}

}
