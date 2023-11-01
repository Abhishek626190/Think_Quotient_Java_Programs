package com.Assignments_Array;

public class Frequency_Array_Element {
	public static void frequency(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=0;j<=9;j++)
			{
				if(a[i]==a[j+1])
				{
					count++;
				}
			}
			System.out.println(a[i]+""+count+"Times");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=Sum_Array.createArray();
		frequency(arr);

	}

}
