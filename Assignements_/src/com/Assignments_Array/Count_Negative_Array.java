package com.Assignments_Array;
//10>count all negative number from array
public class Count_Negative_Array {
	public static void count(int a[])
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				//System.out.println(a[i]);
				count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[];
		arr=Sum_Array.createArray();
		count(arr);

	}

}
