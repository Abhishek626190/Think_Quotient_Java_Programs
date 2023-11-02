package com.Assignements_Array_1D_H.W;

public class Find_Missing_Sequence_Array {
	public static void find(int a[]) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] != i + 1) {
				System.out.println((i + 1) + " is missing");
				break;
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int arr[] = { 1, 2, 3, 4, 6, 7 };
		//int arr[]= {10,11,12,13,14,16,17};
		find(arr);

	}

}
