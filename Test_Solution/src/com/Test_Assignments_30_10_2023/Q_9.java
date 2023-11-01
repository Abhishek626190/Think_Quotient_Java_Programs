package com.Test_Assignments_30_10_2023;

class D {
	static int i = 6;
	static {
		i = i-- - --i;

	}
}

class B extends D {
	static {
		i = --i - i--;
	}
}

public class Q_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		System.out.println(b.i);

	}

}
