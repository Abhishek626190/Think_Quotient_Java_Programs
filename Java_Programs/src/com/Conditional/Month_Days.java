package com.Conditional;
import java.util.*;
public class Month_Days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Valid Month");
		String month=sc.next();
		if(month.equals("February"))
		{
			System.out.println("28 Days in February Month");
		}
		else if(month.equals("April"))
		{
			System.out.println("30 Days in April Month");	
		}
		else if(month.equals("June"))
		{
			System.out.println("30 Days in June Month");	
		}
		else if(month.equals("September"))
		{
			System.out.println("30 Days in September Month");	
		}
		else if(month.equals("November"))
		{
			System.out.println("30 Days in November Month");	
		}
		else if(month.equals("January"))
		{
			System.out.println("31 Days in January Month");
		}
		else if(month.equals("March"))
		{
			System.out.println("31 Days in March Month");
		}
		else if(month.equals("May"))
		{
			System.out.println("31 Days in May Month");
		}
		else if(month.equals("July"))
		{
			System.out.println("31 Days in July Month");
		}
		else if(month.equals("August"))
		{
			System.out.println("31 Days in August Month");
		}
		else if(month.equals(" October"))
		{
			System.out.println("31 Days in October Month");
		}
		else if(month.equals("December"))
		{
			System.out.println("31 Days in December Month");
		}
		else
		{
			
			System.out.println("Invalid Month");
		}

	}

}
