package com.Array_Object;

import java.util.Arrays;

public class Marks_Array {
	private int rollNo;
	private String name;
	private double per;
	double marks[];

	Marks_Array() {
		rollNo = 0;
		name = "";
		per = 0f;
		marks = null;
	}

	Marks_Array(int i, String n, double a[]) {
		rollNo = i;
		name = n;
		marks = a;
		calculatePer(marks);
	}

	public void calculatePer(double a[]) {
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		per = sum / a.length;
	}

	public String toString() {
		return "\nRoll_Num: " + rollNo + "\nName: " + name + "\nPer:" + per + " \n" + "Marks " + Arrays.toString(marks);
	}

	public static void highestPer(Marks_Array[] a) {
		double p = 0.0;
		for (int i = 0; i < a.length; i++) {
			if (a[i].per > p) {
				p = a[i].per;
			}
		}
		System.out.println(p);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double marksarr[] = { 40, 50, 90, 70, 80 };
		double marksarr1[] = { 40, 90, 60, 70, 80 };
		double marksarr2[] = { 40, 50, 60, 70, 80 };
		double marksarr3[] = { 40, 80, 60, 90, 50 };
		double marksarr4[] = { 90, 50, 60, 70, 80 };

		Marks_Array arr[] = new Marks_Array[5];

		arr[0] = new Marks_Array(101, "A", marksarr);
		arr[1] = new Marks_Array(102, "B", marksarr1);
		arr[2] = new Marks_Array(103, "C", marksarr2);
		arr[3] = new Marks_Array(104, "D", marksarr3);
		arr[4] = new Marks_Array(105, "E", marksarr4);

		System.out.println(Arrays.toString(arr));

		highestPer(arr);

	}

}
