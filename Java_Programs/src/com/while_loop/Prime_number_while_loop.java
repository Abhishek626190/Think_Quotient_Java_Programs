package com.while_loop;
import java.util.*;

public class Prime_number_while_loop {
	public static void main(String[]args) {
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter number");
              int num=sc.nextInt();
              int count=0;
              int i=2;
              while(i<num)
              {
            	  if(num%i==0)
            	  {
            		  count=1;
            		  break;
            	  }
            	  i++;
              }
              if(count==1)
            	  {
            	  System.out.println(num+" is not prime number");
            	  }
              else
              {
            	  System.out.println(num+" is prime number");
              }
              
             
                
}
}
