package com.oops;

public class Employee_ {
	private int id;
	private String name;
	private double salary;
	public void setData(int id_,String name_,double sal)
	{
		this.id=id_;
		this.name=name_;
		this.salary=sal;
		 
	}
	public void compare(Employee_ obj)
	{
		if(this.salary>obj.salary) {
			System.out.println(this.name+" salary is more than "+obj.name+" salary");
		}
		else {
			System.out.println(this.name+" salary is more than "+obj.name+" salary");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee_ obj1=new Employee_();
		Employee_ obj2=new Employee_();
		obj1.setData(101, "Abhi", 150000);
		obj2.setData(102, "Abhishek", 100000);
		obj2.compare(obj1);


		
	}

}
