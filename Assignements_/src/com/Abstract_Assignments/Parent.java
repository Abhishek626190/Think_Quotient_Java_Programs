package com.Abstract_Assignments;

public abstract class Parent {
	Parent(String s) {

	}

	public abstract void cook();

	public void wash() {
		System.out.println("Wash method in parent class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.cook();
		c.wash();

	}

}

class Child extends Parent {
	Child() {
		super("Abhi");
	}

	public void cook() {
		System.out.println("cook method in child class");
	}
}
