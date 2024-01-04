package com.april_eclipse_test_2019;

import java.util.ArrayList;
import java.util.Collections;

public class StudentALQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m1[] = { 88, 98, 90 };
		int m2[] = { 78, 58, 90 };
		int m3[] = { 68, 79, 90 };
		StudentQ2 s1 = new StudentQ2(101, "Abhishek", m1);
		StudentQ2 s2 = new StudentQ2(102, "Pratiksha", m2);
		StudentQ2 s3 = new StudentQ2(103, "Rupali", m3);

		ArrayList<StudentQ2> student = new ArrayList<>();
		student.add(s1);
		student.add(s2);
		student.add(s3);
		Collections.sort(student);

		for (StudentQ2 s : student) {
			System.out.println(s);
		}

	}

}
