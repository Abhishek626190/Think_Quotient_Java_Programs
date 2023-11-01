package com.while_loop;
import java.util.*;

public class count_number_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		//int i=1;
		int count=0;
 		
		while(num>0)
		{
			int digit=num%10;
			count=count+1;
			num=num/10;
			
			
			//i++;
			
		}
		System.out.println(count);

	}

}
