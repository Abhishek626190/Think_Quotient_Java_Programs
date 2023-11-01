package com.Interface_Demos;

interface I1 {
	void m1();

}

interface I extends I1 {
	void m2();

}

class A implements I {
	public void m1() {
		System.out.println("Implementation of m1 method in class A");
	}

	public void m2() {
		System.out.println("Implementation of m2 method in class A");

	}
}

abstract class B implements I {

}

public class Demo2 extends A implements I1, I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I am in main method");
		A a = new A();
		I i = new A();// object o A class with the reference interface I
		a.m1();
		i.m1();
		I1 e = new A();
		e.m1();

	}

	public void m2() {

	}

	public void m1() {

	}

}
