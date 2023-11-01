package com.Data_Member_Methods;

import java.util.Scanner;

public class Class_Demo3 {
	String branch_name, acc_name, ifsc;
	long acc_number;
	double total_balance, remaning_bal;
	static double de;
	static double wi;
	static double withdraw;
	static double deposit;
	static int choice;

	public void setData(String bn, String anam, String ifs, long anum, double tb) {
		branch_name = bn;
		acc_name = anam;
		ifsc = ifs;
		acc_number = anum;
		total_balance = tb;

	}

	public void display() {
		System.out.println("Branch_Name:" + branch_name);
		System.out.println("Account_Name:" + acc_name);
		System.out.println("Account_Number:" + acc_number);
		System.out.println("IFSC_Code:" + ifsc);
		System.out.println("Total_Balance:" + total_balance);
		System.out.println("Withdrawl_Amount:" + withdraw);
		System.out.println("Deposited_Amount:" + deposit);
		System.out.println("Remainig_Balance:" + remaning_bal);

	}

	public void checkWithdraw() {
		remaning_bal = total_balance - withdraw;
	}

	public void checkDeposit() {
		remaning_bal = total_balance + deposit;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class_Demo3 obj = new Class_Demo3();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Branch Name");
		String br_na = sc.next();
		System.out.println("Enter Account Name");
		String acc_na = sc.next();
		System.out.println("Enter Account Number");
		long ac_nu = sc.nextLong();
		System.out.println("Enter IFSC Code");
		String if_sc = sc.next();

		obj.setData(br_na, acc_na, if_sc, ac_nu, 0.0);

		System.out.println("For Withdraw Press 1\nFor Deposit Press 2");
		choice = sc.nextInt();

		switch (choice) {
		case 1:
			System.out.println("How much you want to withdraw");
			wi = sc.nextDouble();
			withdraw = wi;
			break;

		case 2:
			System.out.println("How much you want to Deposit");
			de = sc.nextDouble();
			deposit = de;
			break;

		default:
			System.out.println("Invalid Input");
		}

		obj.checkWithdraw();
		obj.checkDeposit();
		obj.display();

	}

}
