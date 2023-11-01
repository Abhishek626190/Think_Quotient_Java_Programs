package com.Assignments_Array;

 public class Put_Array_Seprate_Even_Odd {
	static int evenArr[];
	static int oddArr[];

	public static void seprate() {

		int a[]= {1,2,3,4,5,6,7,8,11,14,16,17};
		evenArr = new int[a.length / 2];
		oddArr = new int[a.length / 2];
		int j=0;
		int k=0;

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
		System.out.println("The even Array is");
		for (int i = 0; i < evenArr.length; i++) {
			System.out.print(evenArr[i] + ",");
		}
	}

	public static void printOdd() {
		
		System.out.println("\nThe odd Array is");

		for (int i = 0; i < oddArr.length; i++) {
			System.out.print(oddArr[i] + ",");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[] = Sum_Array.createArray();
		seprate();
		printEven();
		printOdd();

	}

}
