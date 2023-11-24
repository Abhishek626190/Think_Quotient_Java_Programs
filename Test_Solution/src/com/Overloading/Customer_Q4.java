package com.Overloading;

import java.util.Scanner;

public class Customer_Q4 {

	private int cid,count=0;;
	private String cname, caddress;

	public Customer_Q4() {

	}

	public Customer_Q4(int cid, String cname, String caddress) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.caddress = caddress;
	}
	{
		count++;
		System.out.println("The number of objects created:"+count);
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCaddress() {
		return caddress;
	}

	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}

	public static void create()
 	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer Id");
		int id = sc.nextInt();
		System.out.println("Enter Customer Name");
		String name = sc.next();
		System.out.println("Enter Customer Address");
		String add = sc.next();
		Customer_Q4 cusobj = new Customer_Q4(id, name, add);
		System.out.println(cusobj);
	}

	@Override
	public String toString() {
		return "Customer_Q4 [cid=" + cid + ", cname=" + cname + ", caddress=" + caddress + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Customer Id");
//		int id = sc.nextInt();
//		System.out.println("Enter Customer Name");
//		String name = sc.next();
//		System.out.println("Enter Customer Address");
//		String add = sc.next();
//		Customer_Q4 cusobj = new Customer_Q4(id, name, add);
//		System.out.println(cusobj);
		create();
		create();
		

	}

}
