package com.variables;

public class year {

	public static void main(String[] args) {
		int year=1900;
		int a=year%100;
		if( year%400==0)
		{
			if(a%4==0)
			{
			System.out.println("leap year");
		    }
		   else 
		  {
		  System.out.print("Not leap year");
		  }
		
		}	
		
//		if(year/100 )
//		{
//			if(year%400==0)
//		   {
//			System.out.println("Year is leap year");			
//		   }
//		    else
//		   {
//			System.out.println("Year is not leap year");
//		   }
//		}
//		else
//		{
//			System.out.println("Not a leap year");
//			
//		}
//		
//		// TODO Auto-generated method stub

	}

}
