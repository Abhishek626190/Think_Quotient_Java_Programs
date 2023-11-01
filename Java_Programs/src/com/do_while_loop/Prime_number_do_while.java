package com.do_while_loop;
import java.util.*;

public class Prime_number_do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int count=0;
        int i=2;
        do {
        	if(num%i==0)
        	{
        		   count=1;
        		   break;
        	}
        	i++;
        }while(i<num);
        if(count==0)
        	System.out.print(num+" Is Prime Number:");
        else
        	System.out.println(num+" Is Not a Prime Number:");
	}

}
