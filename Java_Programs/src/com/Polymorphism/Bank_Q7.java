package com.Polymorphism;

public class Bank_Q7 {
	double principal, amount;
	float interest;

	Bank_Q7() {
		this.principal = 0.0;
		this.amount = 0.0;
		this.interest = 0.0f;
	}

	Bank_Q7(double p, double a, float i) {
		this.principal = p;
		this.amount = a;
		this.interest = i;
	}

	public void displayInterest() {
		this.interest = 2;
		System.out.println("Rate Of Interest of Default Account:" + interest + "%");
	}

	public String toString() {
		return "Rate Of Interest of Default Bank:" + interest + "%";
	}

	public static void main(String[] args) {
		Saving_Account s = new Saving_Account();
		Current_Account c = new Current_Account();
		Bank_Q7 b = new Bank_Q7();
		s.displayInterest();
		c.displayInterest();
		b.displayInterest();

	}

}

class Saving_Account extends Bank_Q7 {
	public void displayInterest() {
		this.interest = 3;
		System.out.println("Rate Of Interest of Saving Account:" + interest + "%");
	}
}

class Current_Account extends Bank_Q7 {
	public void displayInterest() {
		this.interest = 5;
		System.out.println("Rate Of Interest of Current Account:" + interest + "%");
	}
}