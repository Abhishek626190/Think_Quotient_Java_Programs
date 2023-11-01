package com.Assignments_Array_Object;

public class Student_Q5 {
	int rollnum, age;
	 String name;
	float marks;
	 

	Student_Q5() {
 
	}

	Student_Q5(int rn, String n, int a, float m ) {
		this.rollnum = rn;
		this.name = n;
		this.age = a;
		this.marks = m;
		 

	}
	
//	Student_Q5( Student_Q5 s[]) {
//		 
//		this.s=s;
//
//	}

	 
	public void setSrollnum(int rn) {
		this.rollnum = rn;
	}

	public int getSrollnum() {
		return rollnum;
	}

	public void setSname(String name) {
		this.name = name;
	}

	public String getSname() {
		return name;
	}

	public void setSage(int age) {
		this.age = age;
	}

	public int setSage() {
		return age;
	}

	public void setSmarks(float m) {
		this.marks = m;
	}

	public float getSmarks() {
		return marks;
	}
	public boolean compareStudent(Student_Q5 c)
	{
		if(this.age<15&&this.marks>60)
		{
			 return true;
		}
		return false;
	}

	public String toString() {
		return "Name:" + name + "\nRoll_Num:" + rollnum + "\nAge:" + age + "\nMarks:" + marks;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Student_Q5 obj = new Student_Q5(23,"Abhi",23,480);
		//System.out.println(obj);
		Student_Q5 sa[] = new Student_Q5 [5];
		sa[0]= new Student_Q5(101,"Abhi",23,45);
		sa[1]= new Student_Q5(102,"Abhishek",22,45);
		sa[2]= new Student_Q5(103,"Abhinav",14,65);
		sa[3]= new Student_Q5(104,"Abhilasha",12,70);
		sa[4]= new Student_Q5(105,"Abhijeet",25,50);
		
		  
 
	}
}
