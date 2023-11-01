package com.while_loop;

import java.util.Scanner;

public class Armstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		//int i=1;
		int sum=0; 
		int org_num=num;
 		
		while(num>0)
		{
			int digit=num%10;
			int arm=digit*digit*digit;
			sum=sum+arm;
			 
			num=num/10;
			
			
			//i++;
			
		}
		if(org_num==sum)
		{
			System.out.println(org_num+"  Number is Armstrong_Number");
		}
		else
		{
			System.out.println(org_num+"  Number is not Armstrong_Number");
	
		}
		//System.out.println(sum);

	}

}
