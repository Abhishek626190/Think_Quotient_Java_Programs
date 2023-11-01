package com.Array_Programs;

public class Sum_even_elements_array {
	int arr[];

	Sum_even_elements_array() {
		arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
	}

	public int sumArray() {
		int sum = 0;
		for (int i : arr) {
			if (i % 2 == 0)
				sum = sum + i;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum_even_elements_array obj = new Sum_even_elements_array();
		System.out.println(obj.sumArray());

	}

}
