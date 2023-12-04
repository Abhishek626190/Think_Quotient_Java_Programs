package com.hashmap_Assignments;

public class Employee {
	int id, dptid;
	String name;
	private double salary;

	public Employee(int id, String name, double salary, int did) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dptid = did;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double sal) {
		this.salary = sal;
	}

	public int getDid() {
		return dptid;
	}

	public void setDid(int id) {
		this.dptid = id;
	}

	@Override
	public String toString() {
		return "Employee [ id= " + id + ", name= " + name + ", Salary= " + salary + ", Department Id= " + dptid + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
