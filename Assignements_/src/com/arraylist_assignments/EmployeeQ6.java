package com.arraylist_assignments;

public class EmployeeQ6 implements Comparable<EmployeeQ6> {
	private int id;
	private String name;
	private double salary;
	DepartmentQ6 dpt;
	
	public EmployeeQ6(int id, String name, double salary, DepartmentQ6 dpt) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dpt = dpt;
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

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public DepartmentQ6 getDpt() {
		return dpt;
	}

	public void setDpt(DepartmentQ6 dpt) {
		this.dpt = dpt;
	}

	@Override
	public String toString() {
		return "\nEmployeeQ6 [id=" + id + ", name=" + name + ", salary=" + salary + ", dpt=" + dpt + "]";
	}
	@Override
	public int compareTo(EmployeeQ6 e)
	{
		return this.name.compareTo(e.name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
