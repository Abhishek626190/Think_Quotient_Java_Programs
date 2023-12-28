package com.innerclassAssignments;

public class OuterQ1 {

	private int num = 100;
	protected String name = "Adarsh";
	public char ch = 'A';
	static String color = "Blue";
	static final int i = 500;

	public OuterQ1() {
		// TODO Auto-generated constructor stub
	}

	public void checkout() {
		System.out.println("I am in check method of static outer ");
	}

	public void sum() {
		Inner1Q1 i = new Inner1Q1();
		Inner2Q1 j = new Inner2Q1();

		i.checkin1();
		j.checkin2();
	}

	static class Inner1Q1 {
		int in1 = 60;
		static int a1=144;

		public Inner1Q1() {
			// TODO Auto-generated constructor stub
			System.out.println("Inner1 Constructor");
		}

		public void show() {
			System.out.println("I am in show method of Inner1");
			// System.out.println(num);
			// System.out.println(name);
			System.out.println(color);
			System.out.println(i);
 		}

		public static void checkin1() {
			System.out.println("I am in check method of static inner1");
			// checkout();

		}

	}

	class Inner2Q1 {
		int in2 = 60;
		static int a=786;
		public Inner2Q1() {
			// TODO Auto-generated constructor stub
			System.out.println("Inner1 Constructor");
		}

		public void show() {
			System.out.println("I am in show method of Inner1");
			System.out.println(num);
			System.out.println(name);
			System.out.println(color);
			System.out.println(i);
			checkout();
		}

		public static void checkin2() {
			System.out.println("I am in check method of static inner2");

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OuterQ1 obj = new OuterQ1();
		System.out.println(obj);
		Inner1Q1 inner1 = new Inner1Q1();
		inner1.show();
		OuterQ1.Inner2Q1 inner2 = obj.new Inner2Q1();
		inner2.show();
		inner2.checkin2();
		inner1.checkin1();
		System.out.println(inner2.in2);

	}

}
