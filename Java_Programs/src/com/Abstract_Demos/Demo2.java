package com.Abstract_Demos;

public abstract class Demo2 {
	public void m1() {
		System.out.println("Demo m1 method in abstract class ");
	}

	public String toString() {
		return "";
	}

	abstract void m2();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Demo2 d = new Test1();
		// d.m1();

	}

}

abstract class Test1 extends Demo2 {
	public void m1() {
		System.out.println("Test class method m1 ");
	}

	abstract void m2();// if child class don`t want to implement parent abstract method then make that
						// method as abstract and class also as abstract and then child class is responsible to implement that method
}

class Test2 extends Demo2 {
	void m2()

	{
		System.out.println("Method of test2 class m2");
	}
}
