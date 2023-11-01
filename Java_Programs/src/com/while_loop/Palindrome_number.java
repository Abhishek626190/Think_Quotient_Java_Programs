package com.while_loop;
import java.util.*;

public class Palindrome_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		//int i=1;
		int rev=0;
		int org_num=num;
		while(num>0)
		{
			int digit=num%10;
			rev=rev*10+digit;
			num=num/10;
			
			
		}
		if(org_num==rev)
		{
			System.out.println(org_num+" Number is palindrome number");
		}
		else
		{
			System.out.println(org_num+" Number is not palindrome number");
	
		}
		//System.out.println(rev);

	}

}
