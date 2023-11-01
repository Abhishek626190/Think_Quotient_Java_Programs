package com.Array_Programs;

public class Return_Array_Method {
	int arr[];

	Return_Array_Method() {
		arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
	}

	Return_Array_Method(int o[]) {
		arr = o;
	}

	public int sumArray() {
		int sum = 0;
		for (int i : arr) {
			sum = sum + i;

		}
		return sum;

	}

	public int[] reverseArray() {
		int newArray[] = new int[arr.length];
		int j = arr.length - 1;
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = arr[j];
			j--;
		}
		return newArray;
	}

	public void printElements() {
		for (int i : arr) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Return_Array_Method obj = new Return_Array_Method();
		System.out.println(obj.sumArray());
		int objArr[] = { 5, 6, 7, 8, 9 };
		Return_Array_Method obj1 = new Return_Array_Method(objArr);
		System.out.println(obj1.sumArray());
		int resArr[] = obj1.reverseArray();
		for (int i : resArr) {
			System.out.println(i);
		}

	}

}
