package com.code_Method;

public class Pattter9 {
	public void pattern()
	{
		for(int i=1;i<=7;i++)
		{
			 int k=1;
			for(int j=1;j<=13;j++)
			{
				
				if(j>=8-i&&j<=6+i)
					if(i%2==0&&j%2==0)
						System.out.print(k++);
					else if(i%2!=0&&j%2!=0)
						System.out.print(k++);
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
		Pattter9 obj=new Pattter9();
		obj.pattern();

	}

}
