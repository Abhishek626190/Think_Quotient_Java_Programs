package com.do_while_loop;
import java.util.*;

public class Even_odd_do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int num=sc.nextInt();
        do {
        	if(num%2==0)
        	    System.out.println("Even Number"); 
        	else
            	System.out.println("Odd Number"); 

        	
           }while(false);
        
	}

}
