package com.Assignments_Array;

public class Find_Frequency_Each_Element {
	public static void frequency(int a[]) {
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}
			if (count >= 0) {
				boolean isnotchecked = true;
				for (int k = i - 1; k >= 0; k--) {
					if (a[k] == a[i]) {
						isnotchecked = false;
					}
				}
				if (isnotchecked) {
					System.out.println(a[i] + " count" + (count + 1));

				}
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 1, 5, 4, 2, 3 };
		frequency(arr);

	}

}
