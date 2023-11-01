package com.Assignments_Array;

public class Count_Duplicate_Element {
	public static void countDuplicate(int a[]) {
		for (int i = 0; i < a.length; i++) {
			boolean isDuplicate = false;
 			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					isDuplicate = true;
 					break;
				}
			}
			if (isDuplicate) {
				boolean isNotPrinted = true;
				for (int k = i - 1; k >= 0; k--) {
					if (a[i] == a[k]) {
 						isNotPrinted = false;
						break;
					}
				}
				if (isNotPrinted) {
					System.out.println(a[i] + " is a duplicate");
 
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = Sum_Array.createArray();
		countDuplicate(arr);

	}

}
