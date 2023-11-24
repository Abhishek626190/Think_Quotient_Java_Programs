package com.Assignments_Array;

public class Arrange_Elements_Even_Odd {
	private int counte = 0, counto = 0;

	public void count(int a[]) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0)
				counte++;
			else
				counto++;
		}
	}

	public void arrange(int a[]) {
		int arre[] = new int[counte];
		int arro[] = new int[counto];
		int j = 0, k = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				arre[j] = a[i];
				j++;
			} else {
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
		Arrange_Elements_Even_Odd obj = new Arrange_Elements_Even_Odd();
		int arr[] = { 2, 3, 4, 5, 6, 7, 8 };
		obj.count(arr);
		obj.arrange(arr);

	}

}
