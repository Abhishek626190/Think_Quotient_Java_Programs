package com.loop_assignements;
import java.util.*;
//8.	 Write a Java program to count number of digits in any number
public class count_number_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to know digit");
		int num=sc.nextInt();
		int n=0,b;
		for(int i=1;num>0;i++)
		{
			b=num%10;
 			num=num/10;
			n++;
		}
		System.out.println(n+"Digits in number");
	}

}
