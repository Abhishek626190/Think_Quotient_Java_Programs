package com.Conditional;
import java.util.*;

public class Greater_bw_3_num_by_nested_if_else 
{
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers in integer");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		if(num1>num2 )
		  {
			if(num1>num3)
			System.out.println(num1+ "is Greater");
			else
			{
				System.out.println(num3+ "Is Greater");
			}
		  }
		else if(num2>num1)
		   {
			if(num2>num3)
			System.out.println(num2+" is Greater");
			else
			{
				System.out.println(num3+"is Greater");
			}
		  }
		else
		{
			System.out.println(num3+"  is Greater");
		}

	}

}


