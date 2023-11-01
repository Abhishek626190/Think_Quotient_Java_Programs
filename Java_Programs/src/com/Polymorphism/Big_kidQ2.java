package com.Polymorphism;

public class Big_kidQ2 extends Kid_Q1 {

	public void readBook()

	{
		System.out.println("No Argument method in Big_Kid ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Big_kidQ2 bkid = new Big_kidQ2();
		Kid_Q1 kid = new Big_kidQ2();
		kid.readBook();
 		bkid.readBook();

	}

}
