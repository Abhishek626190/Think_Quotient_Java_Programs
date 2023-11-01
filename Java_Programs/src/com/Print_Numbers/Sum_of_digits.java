package com.Print_Numbers;

import java.util.Scanner;

public class Sum_of_digits {

	static int num,org_num, sum  ;
	

	public void add() {
		org_num=num;
		while (num != 0) {
			int rem = num % 10;
			
			sum = sum +rem;
			
			num = num / 10;
		}
	}

	public void display() {
		System.out.println("The sum of digits of a number " + org_num + " is: " + sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Sum_of_digits obj = new Sum_of_digits();

		System.out.println("Enter number to get sum of  digits:");
		num = sc.nextInt();

		obj.add();
		obj.display();
		 
	}

}
