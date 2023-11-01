package com.oops;

public class Setter_Getter {
	private int accno;
 	private String ownername;
	private double balance;

	public void setAcc(int a) {
		accno = a;
	}

	public void setOwner(String name) {
		ownername = name;
	}

	public void setBal(double b) {
		balance = b;
	}

	public int getAcc() {
		return accno;
	}

	public String getOwner() {
		return ownername;
	}

	public double getBal() {
		return balance;
	}
//	public void setAcc(short ac)
//	{
//		accno=ac;
//	}

	public void display() {
		System.out.println("The account number is:" + accno);
		System.out.println("The Owner_Name is:" + ownername);
		System.out.println("The Balance is:" + balance);
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Setter_Getter obj = new Setter_Getter();
		System.out.println();
		obj.setAcc(1234567890);
		obj.setAcc(987654);
		obj.setBal(1203654);
		obj.setOwner("Abhi");
//		int a=obj.getAcc();
//		String s=obj.getOwner();
//		double d=obj.getBal();
//		System.out.println(a);
//		System.out.println(s);
//		System.out.println(d);
 		obj.display();

	}

}
