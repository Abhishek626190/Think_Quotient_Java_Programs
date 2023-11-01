package com.oops;

public class Constructors {
	private int age,age1;
	public Constructors()
	{
		this(23,10);
		System.out.println("This is Default Constructor");
	}
	public Constructors(int a,int b)
 	{
		 
		System.out.println("This is parameterized Constructor");
		this.age=a;
		this.age1=b;
		System.out.println(age);
		System.out.println(age1);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is main method");
		Constructors obj=new Constructors();
		Constructors obj1=new Constructors(23,10);

		
		 
		

	}

}
