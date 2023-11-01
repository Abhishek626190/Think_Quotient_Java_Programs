package com.loop_assignements;

import java.util.Scanner;

public class Key_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
 		int key=4;
		int i;
		for( i=1;;i++)
		{
			System.out.println("Enter Number:\nHint:The Key number is between 1 to 9");
			int num=sc.nextInt();
			if(num==key) {
				System.out.println("Wow you found the key number");
			    break;}
			else  
				System.out.println("Oops: Try Again");
				
		}
			System.out.println("You took "+i+" chances to found the key number");
	}

}
