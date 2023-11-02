package com.Arrays_2D;

public class Minimum_Rowwise_Array_Element {
	public static void minElement(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			int min=a[0][0];
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]>min)
				{
					a[i][j]=min;
 				}
				min=a[i][j];
			}
			System.out.println(min);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 22, 9, 31 }, { 12, 25, 26 } ,{34,42,2} };
		minElement(arr);


	}

}
