 package com.code_Method;

public class Pattern7{
	public void pattern()
	{
		for(int i=1;i<=6;i++)
		{
			char ch='A';
			for(int j=1;j<=11;j++)
			{
				
				if(j>=7-i&&j<=5+i)
					if(i%2==0&&j%2!=0)
						System.out.print(ch++);
					else if(i%2!=0&&j%2==0)
						System.out.print(ch++);
					else
						System.out.print(" ");
				else
					System.out.print(" ");
				
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern7 obj=new Pattern7();
		obj.pattern();
		

	}

}
