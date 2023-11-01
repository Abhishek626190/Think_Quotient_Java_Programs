package com.code_Method;

import java.util.Scanner;

public class Armstrong_Number {
	public boolean check(int n)
	{
		int org_num=n;
		int sum=0;
		for(int i=1;n>0;i++)
		{
		int r=n%10;
			n=n/10;
		int res=r*r*r;
			sum=sum+res;
		}
		if(sum==org_num)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Armstrong_Number obj=new Armstrong_Number();
		System.out.println("Please Enter 3 Digit Number Only");
		int num=sc.nextInt();
		boolean res=obj.check(num);
		if(res==true)
		{
			System.out.println(num+" Is Armstrong number");
		}
		else
		System.out.println(num+" Is Not Armstrong number");

	}

}
