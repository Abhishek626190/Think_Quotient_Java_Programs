package com.code_Method;
import java.util.*;

public class Table_of_given_number {
	public void table(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n*i);
 		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);                                                                                                     
		System.out.println("Enter Number");
		int num=sc.nextInt();
		Table_of_given_number obj=new Table_of_given_number();
	    obj.table(num);
		 
		
	

	}

}
