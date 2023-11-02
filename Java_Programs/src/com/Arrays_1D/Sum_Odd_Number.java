package com.Arrays_1D;
//4>print all odd numbers from array
public class Sum_Odd_Number {
	public static void sumOdd(int a[])
	{
		int sum=0;
		System.out.println("The sum of odd elements of array are:");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			  sum=sum+a[i];
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[];
		arr=Sum_Array.createArray();
		sumOdd(arr);

	}

}
