package com.Arrays_2D;

public class Sum_Diadonal_Array_Element {
	public static void sumDiagonal(int a[][])
	{
		int k=0;
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			
			
			for(int j=0;j<i+1;j++)
			{
				sum=sum+a[i][k];
				k++;
			}
			System.out.println(sum);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]={ { 22, 9, 31 }, { 12, 25, 26 }, { 34, 42, 2 } };
		sumDiagonal(arr);

	}

}
