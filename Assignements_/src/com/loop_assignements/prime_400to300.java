package com.loop_assignements;

 
public class prime_400to300 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
 		int count=0;//boolean isprime=true;
		for(int n=400;n>=300;n--)
		  {
			for(int i=2;i<n;i++)
			{
		
				if(n%i==0)
				{
				   count=1;
 				   break;
				}
				
				
			  
			}
			
		    if(count==1)
		     {
//			   System.out.println(n+"not prime number");
//			   
		     }
		    else  
		    {
		    	System.out.println(n+" prime number");
		    }
		    count=0;
		     
		  }
		 
 }
}


