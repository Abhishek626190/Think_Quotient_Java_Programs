package com.code_Method;
import java.util.*;
public class Prime_Number {
	public void check(int num)
	{
		int count=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count=1;
				break;
			}
			
		}
		if(count==1)
			System.out.println(num+":Is prime Number");
		else
			System.out.println(num+":Is Not prime Number");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		Prime_Number obj=new Prime_Number();
		obj.check(num);
	}

}
