package com.Conditional;
import java.util.*;

public class DivisibleBy9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		if(num%9==0)
		{
			System.out.println("The number is completely divisible by 9");
		}
		else
		{
			System.out.println("The number is not divisible by 9");
		}

	}

}
