package com.loop_assignements;
import java.util.*;

public class factorial_sum_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter factorial");
       int num=sc.nextInt();
      
       int sum=0;
       for(int i=1;i<=num;i++)
       {
    	   int fact=1;
    	   for(int n=1;n<=i;n++)
    	   {
    		   fact=fact*n;
     	   }
    	   sum=sum+fact;
    	    
       }
       System.out.println(sum);
    	
       
	}

}
