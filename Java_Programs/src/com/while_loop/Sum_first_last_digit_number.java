package com.while_loop;

import java.util.Scanner;

public class Sum_first_last_digit_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int count=0;
		int sum=0;
 		
		while(num>0)
		{
			int digit=num%10;
			 
			count=count+1;
			
			num=num/10;
			if(count==1||num==0)
			{
				sum=sum+digit;
			}
			 
			
		}
 		System.out.println(sum);

	}

}
