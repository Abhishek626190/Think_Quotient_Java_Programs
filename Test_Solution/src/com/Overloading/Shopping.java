package com.Overloading;

public class Shopping {
	public Shopping() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCard obj = new CreditCard();
		DebitCard obj1 = new DebitCard();
		obj.rs = 500;
		obj1.rs = 800;
		obj.doTransaction(obj);
		obj1.doTransaction(obj1);
	}
}

class CreditCard {
	int rs;
 	public void doTransaction(CreditCard c) {
		System.out.println("You got 15 % discount on credit card transaction");
	}
}

class DebitCard extends CreditCard {
	public void doTransaction(DebitCard d) {
		System.out.println("No discount available for debit card transaction");
	}
}
