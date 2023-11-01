package com.display_series;
//WAC to display number b/w 1 to 50 if number is odd then display it in negative form and if number is even then display its square

public class Display_Series3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=50;i++)
		{
			if(i%2==0)
			{
				System.out.println(i*i);
			}
			else
			{
				System.out.println(-i);
			}
		}

	}

}
