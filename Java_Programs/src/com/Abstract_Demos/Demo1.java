package com.Abstract_Demos;

public abstract class Demo1 {
	Demo1() {
		System.out.println("Abstract class constructor Demo1 class");
		//abstract final void get();
		 
	}

	abstract void m1();

	public abstract void m2();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Demo1 d=new Demo1();// We can not create object of Abstract Class
		Demo1 d1 = new Test();// We can create object of subclass with reference of parent abstract class
		// Test_Mobile t = new Test_Mobile();
		Demo1 t2[] = new Demo1[5];// But we can create array of object of Abstract class
		d1.m1();
		d1.m2();
		 

	}

}

class Test extends Demo1 {
	void m1() {
		System.out.println("Implement abstract method in subclass Test");

		/*
		 * void m2()//We can not decrease the scope of access modifiers but we can
		 * increase {
		 * 
		 * }
		 */
	}

	public void m2() {
		System.out.println("Implement m2 method in Test class");
	}
}
