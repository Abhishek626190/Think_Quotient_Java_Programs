package com.Assignements_Array_1D_H_W;

public class Replace_0s_by_1 {
	public static void replace(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				a[i]=1;
			}
			System.out.print(a[i]+",");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 26, 0, 67, 45, 0, 78, 54, 34, 10, 0, 34 };
		replace(arr);
	}

}
