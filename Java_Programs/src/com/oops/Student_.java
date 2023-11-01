package com.oops;

public class Student_ {
	private int id;
	private String name;

	public void displayData(int id, String name) {
		this.id = id;
		this.name = name;
		// System.out.println(this.id+" "+this.name);
		this.id = 102;
		this.name = "Abhishek";
		System.out.println(this.id + " " + this.name);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_ obj = new Student_();
		obj.displayData(101, "Abhi");
		// obj.setData(103, "Boss");

	}

}
