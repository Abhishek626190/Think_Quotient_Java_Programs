package com.Arrays;
//6>find all the element from array which are divisible by 2 and 3
public class Divide_2_9_Array {
	public static void check(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println("The elements which are divisible by 2&9 are:");

			if(a[i]%2==0&&a[i]%9==0)
			{
				System.out.print(a[i]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[];
		arr=Sum_Array.createArray();
		

	}

}
