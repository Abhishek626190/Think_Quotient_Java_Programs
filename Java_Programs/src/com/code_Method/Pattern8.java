  package com.code_Method;

public class Pattern8{
	public void pattern()
	{
		for(int i=1;i<=9;i++)
		{
			 
			for(int j=1;j<=9;j++)
			{
				
				if(j>=6-i&&j<=4+i)
					if(i%2==0&&j%2!=0)
						System.out.print("*");
					else if(i%2!=0&&j%2==0)
						System.out.print("*");
					else
						System.out.print(" ");
				else
					System.out.print(" ");
				//Yet not completed
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern8 obj=new Pattern8();
		obj.pattern();
		

	}

}
