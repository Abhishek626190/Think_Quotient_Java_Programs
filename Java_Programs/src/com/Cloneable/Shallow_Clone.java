package com.Cloneable;

public class Shallow_Clone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course c = new Course("Maths", "Science", "English");
		Student s = new Student(101, "Abhishek", c);
		Student s1 = null;
		try {
			s1 = (Student) s.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		// System.out.println(s1);
		s1.course.sub3 = "Biology";
		s.course.sub3 = "Economy";
		System.out.println(s);
		System.out.println(s1);

	}

}

class Course {
	String sub1, sub2, sub3;

	Course() {

	}

	Course(String s1, String s2, String s3) {
		this.sub1 = s1;
		this.sub2 = s2;
		this.sub3 = s3;
	}

	@Override
	public String toString() {
		return "Course [sub1=" + sub1 + ", sub2=" + sub2 + ", sub3=" + sub3 + "]";
	}
}

class Student implements Cloneable {
	int id;
	String name;
	Course course;

	public Student(int id, String name, Course course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
  		     return super.clone();
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + "]";
	}
}
