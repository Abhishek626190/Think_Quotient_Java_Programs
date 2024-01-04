package com.april_eclipse_test_2019;

import java.util.Arrays;

public class StudentQ2 implements Comparable<StudentQ2> {
	private int sid;
	private String name;
	private int marks[]=new int[3];
	private float percentage=0;
	
	public StudentQ2(int sid, String name, int[] marks ) {
		super();
		this.sid = sid;
		this.name = name;
		this.marks = marks;
		this.setPercentage(calculatePercentage(marks));
		}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	public float calculatePercentage(int m[])
	{
		int sum=0;
		float per=0;
		for(int i=0;i<m.length;i++)
		{
			sum=sum+m[i];
		}
		per=sum/m.length;
		return per;
		
		
	}
	 
	public int compareTo(StudentQ2 s)
	{
		Float i=s.percentage;
		Float j=this.percentage;
		return i.compareTo(j);
		
	}
	@Override
	public String toString() {
		return "StudentQ2 [sid=" + sid + ", name=" + name + ", marks=" + Arrays.toString(marks) + ", percentage="
				+ percentage + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m1[]= {88,98,90};
		int m2[]= {78,58,90};
		int m3[]= {68,79,90}; 
		StudentQ2 s1=new StudentQ2(101, "Abhishek", m1);
		StudentQ2 s2=new StudentQ2(102, "Pratiksha", m2);
		StudentQ2 s3=new StudentQ2(103, "Rupali", m3);
		System.out.println(s1);
		System.out.println(s2);
 		System.out.println(s3);


		

	}

	

}
