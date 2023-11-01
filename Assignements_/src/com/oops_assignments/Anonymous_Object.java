package com.oops_assignments;

public class Anonymous_Object {
	static int age;
	static String name;
	public void setData(String na,int ag)
	{
		name=na;
		age=ag;
		
	}
	public void display()
	{
		System.out.println(name);
		System.out.println(age);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Anonymous_Object().setData("Abhi", 23);
		new Anonymous_Object().display();

	}

}
