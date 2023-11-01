package com.oops;

public class DisplayData {

	private int id;
	private String name;

	public void displayData(int id, String name) {
		this.id = id;
		this.name = name;
		// System.out.println(this.id+" "+this.name);
		this.id = 102;
		this.name = "Abhishek";
		System.out.println(this.id + " " + this.name);
		id=getData(108);
		System.out.println(id);
		 

	}
	 
	public int getData(int a)
	{
		return a;
		 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisplayData obj = new DisplayData();
		obj.displayData(101, "Abhi");
		// obj.setData(103, "Boss");

	}

}
