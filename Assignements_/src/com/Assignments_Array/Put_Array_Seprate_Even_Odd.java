package com.Assignments_Array;

public class Put_Array_Seprate_Even_Odd {
	static int evenArr[];
	static int oddArr[];

	public static void seprate(int a[]) {

		int j = 0;
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				evenArr[j] = a[i];
				j++;
			} else {
				oddArr[k] = a[i];
				k++;
			}
		}

	}

	public static void printEven() {
		for (int i = 0; i < evenArr.length; i++) {
			System.out.println(evenArr[i] + ",");
		}
	}

	public static void printOdd() {
		for (int i = 0; i < oddArr.length; i++) {
			System.out.print(oddArr[i] + ",");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = Sum_Array.createArray();
		seprate(arr);
		printEven();
		printOdd();

	}

}
