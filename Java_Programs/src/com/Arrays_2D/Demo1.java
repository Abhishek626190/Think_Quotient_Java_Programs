package com.Arrays_2D;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int [2][3];
		arr[0][0]=3;
		arr[0][1]=4;
		arr[0][2]=5;
		
		arr[1][0]=6;
		arr[1][1]=7;
		arr[1][2]=8;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");

			}
			System.out.println();
		}
		

	}

}
