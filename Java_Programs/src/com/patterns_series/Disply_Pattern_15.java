package com.patterns_series;

public class Disply_Pattern_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=0,m;
		for(int i=1;i<=9;i++)
			
		{    m=1; int n=k+i;
			for(int j=1;j<=9;j++)
			{   
				if(j<=n&&j<=18-n)
					{
					System.out.print(m);
					if(j<n) 
					{
  						 m++;
					}
					else 
						 m--;
					  
				   }
				   else
					System.out.print("");
				
			}
			k++;
				 

			System.out.println("");

		}

	}

}
