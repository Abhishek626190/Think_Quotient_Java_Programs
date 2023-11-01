package com.code_Method;

import java.util.Scanner;

public class Harshad_Number_BY_While_Loop {
	public boolean check(int n)
	{
		int sum=0;
		int org_num=n;
		int i=1;
		while(n>0)
		{
			int r=n%10;
			n=n/10;
			sum=sum+r;
			i++;
		}
		if(org_num%sum==0)
			return true;
		else
			return false;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Harshad_Number_BY_While_Loop obj=new Harshad_Number_BY_While_Loop();
		System.out.println("Enter number");
		int num=sc.nextInt();
		boolean res=obj.check(num);
		if(res==true)
		{
			System.out.println(num+" Is Harshad number");
		}
		else
		System.out.println(num+" Is Not Harshad number");

	}

}
