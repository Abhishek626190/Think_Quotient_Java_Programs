package com.patterns_series;

public class Display_Pattern_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=8;i++)
		{
			for(int j=1;j<=15;j++)
			{
				if(j>=i&&j<=16-i )
				    {
					if(j%2==0&&i%2==0)
					  System.out.print("*");
				    else if(j%2!=0&&i%2!=0)
				      {
					  System.out.print("*");
					  }
				    else
				    	System.out.print(" ");
					 
				}
				else
					System.out.print(" ");
			}
			System.out.println("");
		}

	}

}
