package com.constructor;

public class Demo3 {
	Demo3()
	{
		System.out.println("I m in default constructor");
	}

	static {
		System.out.println("Hello i am in static block");
	}
	{
		System.out.println("I am in instance block");
	}
	public static void main(String[] args) {
		Demo3 obj=new Demo3();
		System.out.println(obj);
		System.out.println("I m in main ");

		
	}

}
