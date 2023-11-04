package com.Assignements_Array_1D_H_W;

public class Perfect_Square_Number_Array {
	public static void find(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<=a[i];j++)
			{
				if(a[i]==j*j)
				{
					System.out.println(a[i]+" is perfect square  number");
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {23,43,25, 49, 12, 9, 78, 66, 39, 0};
		find(arr);

	}

}
