package com.code_Method;

import java.util.*;

public class Maximum_number {
	
	public void check(int num)
	{
		int temp=0;
		int rem=0;
		for(int i=1;num!=0;i++)
		{
 			    rem=num%10;
			    num=num/10;
			    if(rem>temp)
			    {
			    	temp=rem;
 			    }
 		}
		System.out.println(temp+":Is Largest Digit");
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		Maximum_number obj=new Maximum_number();
		obj.check(num);

		
	}

}
