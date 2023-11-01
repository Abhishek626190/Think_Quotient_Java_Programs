package com.Assignments_Array;

public class Reverse_Array {
	
	public static void reverseArray(int a[])
	{
		int revArr[]=new int [a.length];
		int count=a.length;
		for(int i=0;i<a.length;i++)
		{
			revArr[i]=a[count-1];
			count--;
		}
		System.out.println("\nThe Reverse array");
		for(int i=0;i<revArr.length;i++)
		{
			System.out.print(revArr[i]+",");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=Sum_Array.createArray();
		System.out.println("\nThe elements of array are:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+",");
		}
		reverseArray(arr);
		
		

	}

}
