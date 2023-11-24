package com.Exception_Assignment;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=null;
		try {
		for(int i:arr)
		{
			System.out.print(i);
		}
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("i am in final block");
		}

	}

}
