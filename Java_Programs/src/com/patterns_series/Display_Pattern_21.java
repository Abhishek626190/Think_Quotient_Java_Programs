package com.patterns_series;

public class Display_Pattern_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=0;
		for(int i=1;i<=9;i++)
		{    int n=k+i;
			for(int j=1;j<=9;j++)
			{   
				if(j<=n&&j<=18-n)
				{
					if(j<=n&&j<=18-n)
					{
						if(j==n&&i%2==0)
							{ System.out.print(--i);
						    i++;}
						else
						System.out.print(j);
						//yet not completed
				    }
				    else
				    {
					System.out.print(" ");
					}
				}
				
			}
			k++;
				 

			System.out.println("");

		}

	}

}
