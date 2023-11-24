package com.Exception_Assignment;

public class Q3 {
	public static void showExc()
	{
		try
		{
			int a=10/0;
			System.out.println(a);
			int arr[]= {1,2,3,4,5};
			for(int i=0;i<=arr.length;i++)
			{
				System.out.print(arr[i]+",");
			}
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showExc();
		

	}

}
