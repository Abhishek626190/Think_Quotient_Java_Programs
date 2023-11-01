package com.patterns_series;

public class Display_Pattern_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=8;i++)
		{
			for(int j=1;j<=8;j++)
			{
				if(j>=9-i)
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println("");
		}

	}

}
