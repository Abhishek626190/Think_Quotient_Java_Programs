package com.Polymorphism;

public class Derived_Q9 {
	public void getDetails(String s) {
		System.out.println("Derived Class:" + s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		t.getDetails("Hello");

	}

}

class Test extends Derived_Q9 {
	public void getDetails(String s) {
		System.out.println("Test Class:" + s);
	}
}