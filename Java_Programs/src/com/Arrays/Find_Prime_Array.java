package com.Arrays;
//8>find all prime numbers array
public class Find_Prime_Array {
	public static void checkPrime(int a[]) {
		System.out.println("The Prime Elements Of Array are:");

		for (int i = 0; i < a.length; i++) {
			int count = 0;

			for (int j = 2; j < a[i]; j++) {
				if (a[i] % j == 0) {
					count++;
					break;

				}
			}
			if (count == 0) {
				System.out.print(a[i] + ",");
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[];
		arr = Sum_Array.createArray();
		checkPrime(arr);

	}

}
