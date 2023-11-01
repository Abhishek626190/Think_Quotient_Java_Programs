package com.ContainmentAssignements;

public class Employee {
	private int id;
	private String name;
	private double salary;
	MyDate md;
	Department_ dm;

	Employee() {

	}

	Employee(String n, int i, double s, MyDate m, Department_ d) {
		this.name = n;
		this.id = i;
		this.salary = s;
		this.md = m;
		this.dm = d;
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
		return "Employee_Name:" + name + "\nEmployee_Id:" + id + "\nSalary:" + salary + "\n" + dm + "\n\n" + md;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Employee obj=new Employee();
//		System.out.println(obj);
		Department_ obj3=new  Department_("Developer",101);
 		MyDate obj2=new MyDate(20,10,2023);

		Employee obj4=new Employee("Abhi",201,123456.00,obj2,obj3);
		System.out.println(obj4);




	}

}
