package com.patterns_series;

public class Display_Pattern_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=4;j++)
			{
				if(j>=i||j<=i)
					if(i==j)
						System.out.print(j);
					else
						System.out.print("0");
			}
			System.out.println("");
		}

	}

}
