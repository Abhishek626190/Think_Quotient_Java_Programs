package com.Assignments_Array_Object;

public class Employee_Q_7 {
	private int num;
	private String name;
	Department_Q7 e;

	public Employee_Q_7() {
		this.num = 0;
		this.name = "";

	}

	Employee_Q_7(int n, String na,Department_Q7 d) {
		this.name = na;
		this.num = n;
		this.e=d;

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
		return "Name:" + name + "\nNumber:" + num+"\nDepartment Details\n"+e;
	}

	public static void main(String[] args) {
		// Employee obj = new Employee();
		// System.out.println(obj);
		Department_Q7  obj2=new Department_Q7(1,"Manager");
		Employee_Q_7 obj1 = new Employee_Q_7(101, "Abhijeet",obj2);

		System.out.println(obj1);

	}

}
