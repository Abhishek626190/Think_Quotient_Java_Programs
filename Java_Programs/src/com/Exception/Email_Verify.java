package com.Exception;

import java.util.Scanner;

public class Email_Verify {
	String email;

	public Email_Verify() {

	}

	public Email_Verify(String e) {
		this.email = e;
	}

	public void userRegister(String em) {
		// boolean n = em.contains("");
		//boolean n = em.equals(null);
		boolean c = em.contains("@");
		boolean b = em.contains(".");
		if (em.contains(null)) {
			System.out.println("Email can not be null");
		} else if (c == false) {
			System.out.println("E-mail must contain @");
		} else if (b == false) {
			System.out.println("Email Must Have valid Domain");
		} else {
			System.out.println("Registration Successfully");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Email_Verify obj = new Email_Verify();
		Scanner sc = new Scanner(System.in);
		System.out.println("Register With E-mail:");
		String emai=null;
		//System.out.println("Enter Your Valid E-mail");
		//String eml = sc.next();
		obj.userRegister(emai);

	}

}
