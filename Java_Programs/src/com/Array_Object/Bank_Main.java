package com.Array_Object;

public class Bank_Main {

	private String bankname, adress, ifsccode;
	Account accinfo;
	Account a[];

	Bank_Main() {
		this.bankname = "";
		this.adress = "";
		this.ifsccode = "";
		this.accinfo = new Account();

	}

	public Bank_Main(String bn, String ad, String ifsc, Account ai,Account a[]) {
		this.bankname = bn;
		this.adress = ad;
		this.ifsccode = ifsc;
		this.accinfo = ai;
		this.a=a;
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
	public void setAccount(Account a[])
	{
		this.a=a;
	}
	public Account[] getAccount()
	{
		return a;
	}

	public String toString() {
		return "BankName:" + bankname + "\naddress:" + adress + "\nIFSC_Code:" + ifsccode + "\nAccount_Information:"
				+ accinfo;
	}
	public void printAccount()
	{
		for(Account a1:a)
		{
			System.out.println(a1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Bank_Main b = new Bank_Main();
		// System.out.println(b);
		System.out.println("******************");
		//Account obj = new Account("Abhishek", 789456123, 546780.14);
		//Bank_Main b1 = new Bank_Main("SBI", "Pune", "SBI0012334", obj);
		//System.out.println(b1);
		Account accArr[]=new Account[3];
		accArr[0]=new Account("Abhishek",546139887,54697.5);
		accArr[1]=new Account("Abhishek",546139887,54697.5);
		accArr[2]=new Account("Abhishek",546139887,54697.5);
		Bank_Main obj1=new Bank_Main("SBI","Pune","ICICC00123",null,accArr);
		System.out.println(obj1);
		obj1.printAccount();
		


	}

}
