package com.Print_Patterns;

public class P13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int k=1;k<=5;k++)
		{
			for(int l=1;l<=10;l++)
			{
				if(l>=4&&l<=7)
					System.out.print("*");
				else
					System.out.print(" ");
				 
			}
			System.out.println("");
		}

	}

}
