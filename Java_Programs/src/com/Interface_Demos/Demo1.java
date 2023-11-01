package com.Interface_Demos;

interface left {
	void m1();
	// System.out.println("");
}

interface right {
	void m2();
}

public class Demo1 implements right, left {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method");
	}

	static {
		System.out.println("I am in static block");
	}

	public void m2() {
		System.out.println("Implentation of m2 method in class demo1 ");
	}

	public void m1() {
		System.out.println("Implentation of m1 method in class demo1 ");

	}
}
