package com.Assignments_Array;

public class Unique_Element_Array {

	public static void countUnique(int a[]) {
		for (int i = 0; i < a.length; i++) {
			boolean isDuplicate = true;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					isDuplicate = false;
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
					System.out.println(a[i] + " is a unique");
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = Sum_Array.createArray();
		countUnique(arr);

	}

}
