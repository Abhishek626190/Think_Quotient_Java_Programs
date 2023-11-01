package com.Conditional;
import java.util.*;

public class Negative_Positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		if(num>0)
		{
			System.out.println("The number is positive");
		}
		else if(num<0)
		{
			System.out.println("The number is negative");
		}
		else
		{
			System.out.println("The number is zero");
		}
	}
}
