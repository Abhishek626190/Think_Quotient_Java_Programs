package com.Assignements_Array_1D_H.W;

public class Replace_Negative_Element_Q7 {
	public static void replace(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				a[i]=a[i-1]*a[i-1];
			}
			System.out.print(a[i]+",");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,3,-19, 29, 5, -61, 44, 7, -9};
		replace(arr);

	}

}
