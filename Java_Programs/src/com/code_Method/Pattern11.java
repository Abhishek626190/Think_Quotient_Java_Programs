package com.code_Method;

public class Pattern11 {
	public void pattern()
	{
		int k=1;
		for(int i=1;i<=7;i++)
		{     
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+++" ");
			}
		        System.out.println("  ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern11 obj=new Pattern11();
		obj.pattern();

	}

}
