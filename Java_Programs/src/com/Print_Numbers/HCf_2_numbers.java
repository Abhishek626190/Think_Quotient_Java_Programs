package com.Print_Numbers;

import java.util.Scanner;

public class HCf_2_numbers {
	static int num1,num2, rem,hcf=0;
	public void check()
	{
		do
		{
			rem = num1 % num2;
 
			if(rem == 0)
			{
				hcf = num2;
			}
			else
			{
				num1 = num2;
				num2 = rem;
			}
 
		}while(rem != 0);
	}
	
	
		 
	public void display()
	{
		System.out.println("The HCF of "+num1+" and "+num2+" is: "+hcf);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HCf_2_numbers obj=new HCf_2_numbers();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		num1=sc.nextInt();
		System.out.println("Enter Second number");
		num2=sc.nextInt();
		obj.check();
		obj.display();
		
		

	}

}
