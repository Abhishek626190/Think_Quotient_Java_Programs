package com.Exception;

import java.util.Scanner;

public class Account {
	// Scanner sc = new Scanner(System.in);

	String name;
	double bal;

	public Account() {

	}
 	public Account(String name, double bal) {

		this.name = name;
		this.bal = bal;
	}

	public void credit(double b) {
		System.out.println("credit");

		bal = bal + b;
		System.out.println("The total amount after debit is=" + bal);
	}

	public void debit(double b) throws InSuffiecientBalance {
		System.out.println("debit");

		if (bal < b)
			throw new InSuffiecientBalance(b);

		bal = bal - b;
		System.out.println("The total amount after credit is=" + bal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Account i = new Account();
		Account a = new Account("Abhi", 500);

		System.out.println("Enter Amount");
		double amount = sc.nextDouble();
		// i.credit(amount);
		try {
			i.debit(amount);
			System.out.println("The balance is"+a.bal);
		} catch (InSuffiecientBalance e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main end");

	}

}
