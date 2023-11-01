package com.Conditional;
import java.util.*;

public class Eligible_to_blood_donate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		System.out.println("Enter your weight");
		int weight=sc.nextInt();
		if(age>18&&weight>=50)
		{
			System.out.println("You are elgible to donate blood");
	
		}
		else
		{
			System.out.println("You are not elgible to donate blood");

		}



	}

}
