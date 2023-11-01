package com.Arrays;

public class Max_Element_Array {
	static int max=0;

	public static void maxElement(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		System.out.println(max);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[];
		arr=Sum_Array.createArray();
		maxElement(arr);
		

	}

}
