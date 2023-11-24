package com.Exception;

public class Demo {
	public static void print(int a[])
	{
		try
		{
			for(int i=0;i<=a.length;i++)
			{
				System.out.println(a[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
 		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40};
		print(arr);
		System.out.println("Main Ends");
		

	}

}
