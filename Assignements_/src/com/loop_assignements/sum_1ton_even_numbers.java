package com.loop_assignements;
import java.util.*;
public class sum_1ton_even_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			if(i%2==0)
			{
				System.out.println();
				sum=sum+i;
			}
		}
		System.out.println(sum);
			

	}

}
