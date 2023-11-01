package com.Assignments_Array_Object;

public class Employee_Q_6 {

	private int num;
	private String name;

	public Employee_Q_6() {
		this.num = 0;
		this.name = "";

	}

	Employee_Q_6(int n, String na) {
		this.name = na;
		this.num = n;

	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.num = id;
	}

	public int getId() {
		return num;
	}

	public String toString() {
		return "Name:" + name + "\nNumber:" + num;
	}

	public static void main(String[] args) {
		// Employee obj = new Employee();
		// System.out.println(obj);
		Employee_Q_6 obj1 = new Employee_Q_6(101, "Abhijeet");
		System.out.println(obj1);

	}

}
