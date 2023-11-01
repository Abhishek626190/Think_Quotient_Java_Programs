package com.Polymorphism;

public class Kid_Q1 {
	Kid_Q1() {

	}

	public void readBook() {
		System.out.println("No Arguments in Kid");
	}

	public void readBook(int i, int j) {
		System.out.println("Int Arguments in kid");

	}

//	public void readBook(String s) {
//		System.out.println("String Argumnets");
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kid_Q1 kid = new Kid_Q1();
		kid.readBook();
		kid.readBook(10, 20);
		//kid.readBook("Abhi");

	}

}
