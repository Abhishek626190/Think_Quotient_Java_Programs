package com.Exception;

public class InSuffiecientBalance extends Exception {
	double balance;

	public InSuffiecientBalance() {

	}

	public InSuffiecientBalance(double b) {
		balance = b;
	}

	public String toString() {
		return "Insuffiecient balance in your Account:"+balance+" Please Add Balance First Then Try";
	}

}
