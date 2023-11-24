package com.Exception;

import java.util.Scanner;

public class Account1 {
	Scanner sc = new Scanner(System.in);
	String name;
	double balance = 500;

	Account1(String name) {
		this.name = name;
	}

	public void transaction() throws InSuffiecientBalance {
		System.out.println("Welcome " + name + " In Think Quotient Bank");
		System.out.println("Press 'W' for Withdraw OR 'D' for Credit");
		String choice = sc.nextLine();
		switch (choice) {
		case "W":
			System.out.println("Balance In your Account is:" + balance);
			System.out.println("Enter Amount to Withdraw");
			double amt = sc.nextDouble();
			if (amt > balance) {
				throw new InSuffiecientBalance(balance);
			}
			balance = balance - amt;
			System.out.println("Withdaw Successfully:");
			System.out.println("Total Balance:" + balance);
			System.out.println("Thank You For Banking");
			break;
		case "D":
			System.out.println("Balance In your Account is:" + balance);
			System.out.println("Enter Amount to Debit");
			double amt1 = sc.nextDouble();
			balance = balance + amt1;
			System.out.println("Debited Successfully:");
			System.out.println("Total Balance:" + balance);
			System.out.println("Thank You For Banking");
			break;
		default:
			System.out.println("Invalid Outpt: Try Again");

		}
	}
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account1 obj = new Account1("Abhishek");
		try {
			obj.transaction();
		} catch (InSuffiecientBalance e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(e);
		}

	}

}
