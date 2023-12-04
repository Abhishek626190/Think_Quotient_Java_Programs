package com.Test_23_Nov;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int fact=1;
		System.out.println("Enter number to find factorial");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("The factorial of "+num+" Is "+fact);
	}

}
