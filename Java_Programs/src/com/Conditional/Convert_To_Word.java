package com.Conditional;
import java.util.*;

public class Convert_To_Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number between 1 to 5");
		int num=sc.nextInt();
		if(num==1)
		{
			System.out.println("One");
		}
		else if(num==2)
		{
			System.out.println("Two");
		}
		else if(num==3)
		{
			System.out.println("Three");
		}
		else if(num==4)
		{
			System.out.println("Four");
		}
		else if(num==5)
		{
			System.out.println("Five");
		}
		else
		{
			System.out.println("Invalid  Input");
		}	
	}
}
