package com.test_08_12_23_Friday_OL;

public class Q7_Q3 {

	public static void foo(Book b1) {
		b1.price = 150;
		b1 = null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book();
		b1.price = 500;
		Book b2;
		foo(b1);
		b2 = b1;
		System.out.println(b2.price);

	}

}

class Book {
	String name;
	int price = 250;
}
