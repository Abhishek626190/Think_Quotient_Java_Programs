package com.Conditional;
import java.util.*;

public class Greaater_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First  Number");
		int num1=sc.nextInt(); 
		System.out.println("Enter Second Number");
		int num2=sc.nextInt();
		if(num1>num2)
		{
			System.out.println("Num1 is greater than Num2");
		}
		else
		{
			System.out.println("Num2 is greater than Num1");	
		}
	}
}
