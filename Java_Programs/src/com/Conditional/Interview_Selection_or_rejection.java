package com.Conditional;
import java.util.*;

public class Interview_Selection_or_rejection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your passsing year");
		int year=sc.nextInt();
		System.out.println("Enter your percentage  ");
		int per=sc.nextInt();
		//by using nested if else....
//		if(year==2022) 
//		{
//			if(per>60)
//			{
//				System.out.println("your are selected for Interview");
//			}
//			else
//			{
//				System.out.println("your are not selected for Interview");
//
//			}
//		}
//		else
//		{
//			System.out.println("your are not selected for Interview");
//	
//		}
		
// by using && operator....		
		if(year==2022&&per>=60)
		{
		System.out.println("You are selected for Interview");
		}
		else
		{
			System.out.println("You are not selected for Interview");

		}
		
	}
}


