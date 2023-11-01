package com.Data_Member_Methods;

import java.util.Scanner;

public class Sum_Even_Digit {
  static int num;
  int sum=0;

	public void extract()
	{   
		for(int i=1;num>0;i++)
		{
			int rem=num%10;
			if(rem%2==0)
		      sum=sum+rem;
			
			num=num/10;
		}
	}
	public void display()
	{
		System.out.println("The sum of Even number is:"+sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter_Number");
		num=sc.nextInt();
		Sum_Even_Digit obj=new Sum_Even_Digit();
		obj.extract();
		obj.display();
		

	}

}
