package com.Assignments_Array;
import java.util.Scanner;
//WAP to search for a given number in an array and accordingly print the index if exists.
public class Search_Index_Array {
	public static void searchIndex(int a[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Element to find its index number");
		int search=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==search)
			{
				System.out.println("Index number of element "+a[i]+" is "+i);
			}
			 
		}
		sc.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[];
		arr=Sum_Array.createArray();
		Sum_Array.printArray(arr);
		//System.out.println("******************");
		searchIndex(arr);
		

	}

}
