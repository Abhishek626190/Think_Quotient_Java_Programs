package com.Data_Member_Methods;

import java.util.*;

public class Class_Demo5 {
	int eid;
	String ename, email;
	float basicsal, pf, da, hra, netsal;

	public void setData(int id, String en, String em, float bs) {
		eid = id;
		ename = en;
		email = em;
		basicsal = bs;
	}

	public void findPf() {
		pf = (basicsal * 10) / 100;
	}

	public void findDa() {
		da = (basicsal * 20) / 100;
	}

	public void findHra() {
		hra = (basicsal * 15) / 100;
	}

	public void calculateNetsal() {
		netsal = (basicsal - pf + da + hra);
	}

	public void display_Data() {
		System.out.println("Name:" + ename);
		System.out.println("E_Id:" + eid);
		System.out.println("E_Mail:" + email);
		System.out.println("Basic_Salary:" + basicsal);
		System.out.println("PF:" + pf);
		System.out.println("DA:" + da);
		System.out.println("HRA:" + hra);
		System.out.println("Net_Salary:" + netsal);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class_Demo5 obj = new Class_Demo5();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		String name = sc.nextLine();
		System.out.println("Enter E_Mail");
		String email = sc.nextLine();
		System.out.println("Enter Employee_Id");
		int e_id = sc.nextInt();
		System.out.println("Enter Basic_Salary");
		float basicsalary = sc.nextFloat();
		obj.setData(e_id, name, email, basicsalary);
		obj.findPf();
		obj.findDa();
		obj.findHra();
		obj.calculateNetsal();
		obj.display_Data();
	}

}
