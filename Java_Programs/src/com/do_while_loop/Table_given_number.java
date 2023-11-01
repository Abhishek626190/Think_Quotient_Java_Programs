package com.do_while_loop;
import java.util.*;

public class Table_given_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in );
		System.out.println("Enter any number to print table");
		int num=sc.nextInt();
		 
		int i=1;
		do {
			
 			System.out.println(num*i);
			i++;
			
		   }while(i<=10);
		

	}

}
