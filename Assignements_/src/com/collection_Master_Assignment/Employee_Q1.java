package com.collection_Master_Assignment;

public class Employee_Q1 implements Comparable<Employee_Q1> {
	private int id;
	private String name;
	
	public Employee_Q1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	public int compareTo(Employee_Q1 e)
	{
		Integer i=this.id;
		Integer i1=e.id;
		return i.compareTo(i1);
	}

	@Override
	public String toString() {
		return "Employee_Q1 [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
