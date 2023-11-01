package com.code_Method;
import java.util.*;
public class Harshad_NUmber {
	public boolean check(int n)
	
	{
	    int sum=0;
	    int org_num=n;
		for(int i=1;n>0;i++)
		{
		int r=n%10;
			n=n/10;
			sum=sum+r;
		}
		if(org_num%sum==0)
		{
			//System.out.println("Harshad Number");
			return true;
		}
		else
		{
			return false;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Harshad_NUmber obj=new Harshad_NUmber();
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
