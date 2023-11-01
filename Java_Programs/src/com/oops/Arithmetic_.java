package com.oops;

public class Arithmetic_ {

	public void mul(int i, int j) {
		System.out.println("I am in int");
		System.out.println(i * j);
	}

	public void mul(float i, float j) {
		System.out.println("I am in float");

		System.out.println(i * j);
	}

	public void mul(double i, double j) {
		System.out.println("I am in double");

		System.out.println(i * j);
	}

	public void mul(short i, short j) {
		System.out.println("I am in short");

		System.out.println(i * j);
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmetic_ obj = new Arithmetic_();
		obj.mul(10, 20);
		obj.mul(10.0, 20.0);
		obj.mul(10f, 20f);
		obj.mul((short)10, (short)20);

	}

}
