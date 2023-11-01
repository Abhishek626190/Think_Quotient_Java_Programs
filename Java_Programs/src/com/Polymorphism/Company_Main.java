package com.Polymorphism;

class Company {
	Company() {
		System.out.println("Company default constructors");

	}

	public void address() {
		System.out.println("Hlw this is company method address");
	}
}

class Ebay extends Company {
	Ebay() {
		System.out.println("Ebay default constructor");
	}

	public void address() {
		System.out.println("Hlw this is Ebay method address");
	}
}

public class Company_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ebay e = new Ebay();
		e.address();
	}

}
