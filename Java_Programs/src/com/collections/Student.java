package com.collections;

import java.util.ArrayList;

public class Student implements Comparable<Student> {
	String name;
	int id;
	float percentage;
	String grade;
	ArrayList<Integer> marks;

	public Student() {

	}

	public Student(String name, int id, ArrayList<Integer> marks) {
		super();
		this.name = name;
		this.id = id;
		this.marks = marks;
		calculatePercentage();
		calculateGrade();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void calculatePercentage() {
		int sum = 0;
		for (int m : marks) {
			sum = sum + m;
		}
		percentage = sum / 5;

	}

	public void calculateGrade() {
		if (percentage >= 90) {
			grade = "A";
		} else if (percentage >= 80) {
			grade = "B";
		} else if (percentage >= 70)
			grade = "C";
		else if (percentage >= 60)
			grade = "D";
		else
			grade = "You are Fail";
	}

	@Override
	public String toString() {
		return "\nStudent [name=" + name + ", id=" + id + ", percentage=" + percentage + ", grade=" + grade + ", marks="
				+ marks + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<Integer> l1 = new ArrayList<>();
//		System.out.println(l1);

	}

//	@Override
//	public int compareTo(Student o) {
//		// TODO Auto-generated method stub
//		int res = this.name.compareTo(o.name);
//		//System.out.println(res);
//		return res;
//	}
//	@Override
//	public int compareTo(Student o) {
//		// TODO Auto-generated method stub
//		if(this.id==o.id)
//			return 0;
//		else if(this.id>o.id)
//			return 1;
//		else
//			return -1;
//		 
//	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if (this.percentage == o.percentage)
			return 0;
		else if (this.percentage > o.percentage)
			return 1;
		else
			return -1;

	}

}
