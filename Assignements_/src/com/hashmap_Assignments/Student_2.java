package com.hashmap_Assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class Student_2 {
	private int id;
	private String name;
	private float percentage;
	private ArrayList<Integer> marks;
	private String grade;

	public Student_2(int id, String name, ArrayList<Integer> marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.percentage = calculatePercentage();
		this.grade = calculateGrade();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	public ArrayList<Integer> getMarks() {
		return marks;
	}

	public void setMarks(ArrayList<Integer> marks) {
		this.marks = marks;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public float calculatePercentage() {
		int sum = 0;
		for (int i : marks) {
			sum = sum + i;
		}
		percentage = sum / 5;
		return percentage;
	}

	public String calculateGrade() {
		if (percentage > 90)
			grade = "A";
		else if (percentage > 80) {
			grade = "B";
		} else if (percentage > 70) {
			grade = "C";
		} else if (percentage > 60) {
			grade = "D";
		} else
			grade = "F";
		return grade;
	}

	@Override
	public String toString() {
		return "Student_2 [id=" + id + ", name=" + name + ", percentage=" + percentage + ", marks=" + marks + ", grade="
				+ grade + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> m1 = new ArrayList<Integer>(Arrays.asList(80, 68, 78, 59, 79));
		Student_2 obj = new Student_2(101, "Abhi", m1);
		System.out.println(obj);

	}

}
