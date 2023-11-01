package com.Array_Programs;

public class Student_var_args {
	private int rollNo;
	private String name;
	private static String collegeName;
	private int marks[];
	private float percentage;
	private char grade;

	Student_var_args(int o[], String name, int rollno) {
		collegeName = "Think_Quotient";
		marks = new int[5];
		marks = o;
		this.name = name;
		this.rollNo = rollno;
		this.calculatePer();
		this.grade();

	}

	public char grade() {

		if (percentage > 90)
			grade = 'A';
		else if (percentage > 80)
			grade = 'B';
		else if (percentage > 70)
			grade = 'C';
		else if (percentage > 60)
			grade = 'D';
		else if (percentage > 50)
			grade = 'E';

		return grade;
	}

	public float calculatePer() {
		int sum = 0;
		for (int i : marks) {
			sum = sum + i;
		}

		percentage = sum / 5;
		return percentage;

	}

	public String toString() {
		return "Student Roll_No:" + rollNo + "\nStudent_Name:" + name + "\nCollege_Name:" + collegeName
				+ "\nPercentage:" + percentage + "%" + "\nGrade:" + grade;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 85, 86, 84, 87, 88 };
		Student_var_args obj = new Student_var_args(a, "Abhi", 101);
		System.out.println(obj);
		System.out.println("*******");
		int b[] = { 95, 96, 94, 97, 98 };
		Student_var_args obj1 = new Student_var_args(b, "Abhishek", 102);
		System.out.println(obj1);

	}

}
