package com.code_Method;

public class Pattern6 {
	public void pattern()
	{
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j<=i&&j<=11-i)
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern6 obj=new Pattern6();
		obj.pattern();
		

	}

}
