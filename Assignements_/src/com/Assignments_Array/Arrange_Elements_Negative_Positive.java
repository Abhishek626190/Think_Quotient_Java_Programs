package com.Assignments_Array;

public class Arrange_Elements_Negative_Positive {

	private int countp = 0, countn = 0;

	public void count(int a[]) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0)
				countp++;
			else if (a[i] < 0)
				countn++;
		}
	}

	public void arrange(int a[]) {
		int arre[] = new int[countp];
		int arro[] = new int[countn];
		int j = 0, k = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				arre[j] = a[i];
				j++;
			} else if (a[i] < 0) {
				arro[k] = a[i];
				k++;
			}
		}
		int arr[] = new int[arre.length + arro.length];
		for (int i = 0; i < arre.length; i++) {
			arr[i] = arre[i];
		}
		int l = 0;
		for (int i = arre.length; i < arr.length; i++) {
			arr[i] = arro[l];
			l++;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrange_Elements_Negative_Positive obj = new Arrange_Elements_Negative_Positive();
		int arr[] = { 2, -3, -1, 4, -5, 6, -7, 8, 10, 1, -2 };
		obj.count(arr);
		obj.arrange(arr);
	}

}
