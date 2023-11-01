package com.Conditional;
import java.util.*;

public class Divisible_By_9_Or_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
	   if(num%3==0&&num%9==0)
		{
			System.out.println("The number is completely divisible by 3 and 9");
		}
	   else if(num%9==0)
		{
			System.out.println("The number is completely divisible by 9");
		}
		else if(num%3==0)
		{
			System.out.println("The number is completely divisible by 3");
		}
 
		else
		
		{
			System.out.println("The number is not divisible by 9 or 3");
		}
		
		
		

	}

}
