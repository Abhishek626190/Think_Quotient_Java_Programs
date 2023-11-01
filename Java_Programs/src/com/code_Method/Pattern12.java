package com.code_Method;

public class Pattern12 {
	public void pattern()
	{
		for(int i=1;i<=5;i++)
		{
			int k=1;
			for(int j=1;j<=5;j++)
			{
				if(i>=i&&j<=5-i)
				   System.out.print(k);
 				else  
					System.out.print(i);
				 
				
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern12 obj=new Pattern12();
		obj.pattern();

	}

}
