package com.ContainmentAssignements;

public class Student {
	private int rollNum;
	private String name;
	Student()
	{
		
	}
	Student(String n, int r)
	{
		this.name=n;
		this.rollNum=r;
	}
	public void setRollNum(int i)
	{
		this.rollNum=i;
	}
	public int getRollNum()
	{
		return rollNum;
	}
	public void setName(String na)
	{
		this.name=na;
	}
	public String getName()
	{
		return name;
	}
	public String toString()
	{
		return "Name:"+name+"\nRollNum:"+rollNum+"";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj1=new Student();
		System.out.println(obj1);

	}

}
