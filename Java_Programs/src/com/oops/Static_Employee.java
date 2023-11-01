package com.oops;

public class Static_Employee {
	static int counter = 100;
	private int id = counter;
	private String name;
	private float salary;

	Static_Employee() {
		this.id = counter++;
	}
//	public String toString()
//	{
//		return "id:"+id+"name:"+name+"salary:"+salary;
//	}
	public void setData(String name, float salary) {

		this.name = name;
		this.salary = salary;
	}

	public void displayData() {
		System.out.println("Id: " + (id) + " Name :" + name + " Salary " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static_Employee obj1 = new Static_Employee();
		Static_Employee obj2 = new Static_Employee();
		Static_Employee obj3 = new Static_Employee();
//		obj3.toString();
//		System.out.println(obj3);
//		System.out.println(obj2);
		obj1.setData("Abhi", 15243f);
		obj2.setData("Abhishek", 15244f);
		obj3.setData("Abhinav", 15245f);
		obj1.displayData();
		obj2.displayData();
		obj3.displayData();

	}

}
