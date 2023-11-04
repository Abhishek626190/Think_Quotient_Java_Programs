package com.Assignements_Array_1D_H_W;

public class Equality_Two_Array {
	public static void equality(int a[],int b[])
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					count++;
				}
			}
		}
		if(count==a.length)
		{
			System.out.println("equal");
		}
		else
			System.out.println("not equal");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12, 22, 32, 42, 52, 62};
		int arr1[]= {52, 32, 62, 12, 42, 22};
		equality(arr, arr1);

	}

}
