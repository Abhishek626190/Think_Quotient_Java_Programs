package com.Cloneable;

public class Deep_Clone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course1 c = new Course1("History", "Economics", "Commerce");
		Student1 s = new Student1(101, "Abhi", c);
		Student1 s1=null;
		try
		{
			  s1=(Student1) s.clone();
 		}
		catch(CloneNotSupportedException e)
		{
			System.out.println("This is a wrong number");
			e.printStackTrace();
 		}
		s.course.sub2="Bussiness@Economics";
		System.out.println(s);
		System.out.println(s1);

	}

}

 class Course1 implements Cloneable {
	String sub1, sub2, sub3;

	Course1(String s1, String s2, String s3) {
		this.sub1 = s1;
		this.sub2 = s2;
		this.sub3 = s3;
	}
	@Override
	protected Object clone()throws CloneNotSupportedException{
		 return super.clone();
	}

	public String toString() {
		return sub1 + " " + sub2 + " " + sub3;
	}
}

class Student1 implements Cloneable {
	int id;
	String name;
	Course1 course;

	Student1(int i, String n, Course1 c) {
		this.id = i;
		this.name = n;
		this.course = c;
	}

	@Override
	protected Object clone()throws CloneNotSupportedException{
		Student1 student=(Student1)super.clone();
		student.course=(Course1)course.clone();
		return student;
	}

	public String toString() {
		return id + " " + name + " " + course;
	}
}
