package com.Exception_Assignment;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=null;
		try {
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		System.out.println("**************");
		int arr[]=null;
		try {
		for(int i:arr)
		{
			System.out.print(i);
		}
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		 
	}

}
