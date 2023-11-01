package com.code_Method;
import java.util.*;
public class Fibonacci_Series {
	public void check(int num)
	{
		int num1=0;
		int num2=1;
		int sum;
		System.out.print(num1+",");
		
		System.out.print(num2+",");
		for(int i=3;i<=num;i++)
		{
			
 			sum=num1+num2;
			System.out.print(sum+",");
//			if(sum%5==0)
//				System.out.print(sum+",");
			num1=num2;
			num2=sum;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num");
		int num=sc.nextInt();
		Fibonacci_Series obj=new Fibonacci_Series();
		obj.check(num);
		

	}

}
