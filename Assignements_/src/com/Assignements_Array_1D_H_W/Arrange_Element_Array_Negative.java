package com.Assignements_Array_1D_H_W;

public class Arrange_Element_Array_Negative {
	public static int[] arrange(int a[]) {
		int j = 1;
		for (int i = 0; j < a.length; i++) {
			int temp = 0;
			if (a[i] < 0) {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				j++;
			}

			j++;
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, -6, 23, -67, 39, 10, 2};
		arr = arrange(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}

	}

}
