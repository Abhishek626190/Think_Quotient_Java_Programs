package com.loops;
import java.util.*;

public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int count=0;//boolean isprime=true;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count=1;//isprime=false
				break;
			}
		}
		if(count==1)//(isprime=true)
		{
			System.out.println("Number is not prime number");
		}
		else
		{
			System.out.println("Number is prime number");

		}
		
	}

}
