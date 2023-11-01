package com.loops;
import java.util.*;

public class Magic_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int magic_number=7;
		int n=0;
		for(int i=1;;i++)
		{
			System.out.println("Enter to Guess Magic_Number");
			int num=sc.nextInt();
			
			if(num>magic_number)
			{
				System.out.println("Number is greater than magic number,Please Try Again");
//				continue;
			}
			else if(num<magic_number)
			{
				System.out.println("Number is Less than magic number,Please Try Again");
//				continue;
			}
			else
			{
				System.out.println("Number matched with Magic Number");
				n=n+1;
				break;
			}
			n=n+1;
			
		}
		if(n<=3)
		{
			System.out.println("Hurrey:You Won");

			System.out.println(n+" chances you take to guess Magic Number");
		}
		else
		{
			System.out.println(" You Loss :Better Luck Next Time ");

			System.out.println(n+" chances you take to guess Magic Number:Take 3 Chance or less to won the game");

		}
		
	}

}
