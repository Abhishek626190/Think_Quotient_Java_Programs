package com.oops;

class Static_Demo {
	static {
		System.out.println("I am in Demo_Main");
	}

	public static void Demo() {
		System.out.println("I am in main");

	}
}

public class Static_Blocks {
	private static int age;
	static {
		age = 23;
		System.out.println("I am in static one");
		System.out.println(age);

	}
	static {
		System.out.println("I am in static second");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static_Demo.Demo();
 		System.out.println("I am in main method");
		
	}

}
