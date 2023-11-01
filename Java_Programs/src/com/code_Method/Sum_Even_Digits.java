package com.code_Method;
import java.util.*;
public class Sum_Even_Digits {
	public void add(int num)
	{
		int sum=0;
		for(int i=1;num>0;i++)
		{
			int rem=num%10;
			    num=num/10;
			    if(rem%2==0)
			    {
			    	 sum=sum+rem;
			    }
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int  num=sc.nextInt();
		Sum_Even_Digits obj=new Sum_Even_Digits();
		obj.add(num);
		
		

	}

}
