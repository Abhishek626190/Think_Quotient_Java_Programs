package com.Assignments_Array_Object;

public class Employee {
	private int id;
	private String name;
	private double salary;
	MyDate doj;
	Department_Q3 dpt;
	

	public Employee() {
		this.id = 0;
		this.name = "";
		this.salary = 0.0;
		this.doj = new MyDate();
		this.dpt=new Department_Q3();

		// TODO Auto-generated constructor stub
	}

	Employee(int i, String na, double sal, MyDate d,Department_Q3 dp) {
		this.name = na;
		this.id = i;
		this.salary = sal;
		this.doj = d;
		this.dpt=dp;

	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public String toString() {
		return "Name:" + name + "\nId:" + id + "\nSalary:" + salary + "\n" + doj+"\nDepartmnet_Details\n"+dpt;
	}

	public static void main(String[] args) {
		//Employee obj = new Employee();
		// System.out.println(obj);
		Employee obj1 = new Employee(101, "Abhi", 456123.0, new MyDate(10, 12, 2023),new Department_Q3(1002,"Manager"));
		System.out.println(obj1);

	}

}
