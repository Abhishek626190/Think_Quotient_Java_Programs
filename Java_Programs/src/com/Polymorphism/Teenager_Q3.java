package com.Polymorphism;

public class Teenager_Q3 extends Kid_Q1 {
	public void readBook() {
		System.out.println("No Argumnet in ReadBook");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teenager_Q3 t = new Teenager_Q3();
		Kid_Q1 k1;
		Kid_Q1 k2;
		k2 = new Teenager_Q3();
		k1 = new Big_kidQ2();
		k1.readBook();
		k2.readBook();
		t. readBook();
//		if(k2 instanceof Teenager_Q3)
//		{
//			System.out.println("Teenager object");
//		}
//		else if(k2 instanceof Big_kidQ2)
//		{
//			System.out.println("Big Kid object");
//		}
//		else
//		{
//			System.out.println("Kid object");
//		}

	}

}
