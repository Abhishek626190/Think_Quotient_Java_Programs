package com.code_Method;
import java.util.*;
public class Addition {
	public int Add( int i,int j)
	{
		int res= i+j;
		return res ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=obj.nextInt();
		System.out.println("Enter first number");
		int num2=obj.nextInt();
		Addition sc=new Addition();
		int add=sc.Add(num1,num2);
		System.out.println(add);

	}

}
