package com.Assignements_Array_1D_H_W;

public class Shuffle_Array {
	public static int[] shuffle(int a[])
	{
		int j=1;
		
		for(int i=0;j<a.length;i++)
		{
			int temp=0;
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			j++;
			 
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5, 6, 23, 67, 39, 10, 2};
		arr=shuffle(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+",");
		}
	}

}
