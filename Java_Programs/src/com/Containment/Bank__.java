package com.Containment;

public class Bank__ {
	private String bankname, adress, ifsccode;
	Account__ accinfo;

	Bank__() {
		this.bankname = "";
		this.adress = "";
		this.ifsccode = "";
		this.accinfo = new Account__();

	}

	public Bank__(String bn, String ad, String ifsc, Account__ ai) {
		this.bankname = bn;
		this.adress = ad;
		this.ifsccode = ifsc;
		this.accinfo = ai;
	}

	public void setbanknamee(String n) {
		this.bankname = n;
	}

	public void setAdress(String a) {
		this.adress = a;
	}

	public void setifsccode(String b) {
		this.ifsccode = b;
	}

	public String getIfsccode() {
		return ifsccode;
	}

	public String getBankName() {
		return bankname;
	}

	public String getAdress() {
		return adress;
	}

	public String toString() {
		return "BankName:" + bankname + "\naddress:" + adress + "\nIFSC_Code:" + ifsccode + "Account_Information:"
				+ accinfo;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank__ b = new Bank__();
		System.out.println(b);
		System.out.println("******************");
		Account__ obj = new Account__("Abhishek", 789456123, 546780.14);
		Bank__ b1 = new Bank__("SBI", "Pune", "SBI0012334", obj);
		System.out.println(b1);

	}

}
