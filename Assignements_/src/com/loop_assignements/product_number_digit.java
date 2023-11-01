package com.loop_assignements;

import java.util.Scanner;

public class product_number_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to know product of its digit");
		int num=sc.nextInt();
		int n=1,b=0;
		for(int i=1;num>0;i++)
		{
			b=num%10;
			num=num/10;
            n=b*n;
 	    }
		System.out.println(n);
		 

	}

}
