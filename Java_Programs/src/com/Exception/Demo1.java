package com.Exception;

public class Demo1 {
	public static void display(int a[]) {
		try {
			for (int i = 0; i <a.length; i++) {
				System.out.print(a[i] + ",");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("I am in Index Out of Bound Catch");
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("I am in Null Pointer Catch");
			e.printStackTrace();
		} finally {
			System.out.println("I am in final block");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = null;
		int arr1[] = { 54, 56, 29, 83, 76, 20 };
		display(arr1);
		display(arr);

	}

}
