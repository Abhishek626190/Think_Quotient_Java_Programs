package com.Polymorphism;

public class Person_Q8 {
	public void readScript() {
		System.out.println("Person Class Method readScript");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person_Q8 p = new Person_Q8();
		Actor a = new Actor();
		p.readScript();
		a.readScript();
//		Person_Q8 p1=new Actor();
//		p1.readScript();

	}

}

class Actor extends Person_Q8 {
	public void readScript() {
		System.out.println("Actor Class Method readScript");
	}
}
