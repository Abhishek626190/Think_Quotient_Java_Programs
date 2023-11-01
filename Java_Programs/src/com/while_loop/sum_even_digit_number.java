package com.while_loop;

import java.util.Scanner;

public class sum_even_digit_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		//int i=1;
		int sum=0;
 		
		while(num>0)
		{
			int digit=num%10;
			 
			num=num/10;
			if(digit%2==0)
			{
				sum=sum+digit;
			}
			//i++;
			
		}
 		System.out.println(sum);



	}

}
