package com.fileHandling;

public class Employee {
	private int eid;
	private String name;
	private double salary,pf,da;
	MyDate_ md;
	Employee()
	{
		
	}
	Employee(int id,String n,double sal,double p,double d,MyDate_ m)
	{
		this.eid=id;
		this.name=n;
		this.salary=sal;
		this.md=m;
		this.pf=p;
		this.da=d;
	}
	
	public String toString()
	{
		return "Employee Details\n"+"Id:"+eid+"\nName:"+name+"\nBasic_Salary:"+salary+"\nPf:"+pf+"%\nDA:"+da+"%\n"+md;
	}
	public   double calculateSalary()
	{
		double sal=salary+((salary*pf)/100)+((salary*da)/100);
		return sal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj=new Employee(101,"Abhi",15000,10,15,new MyDate_(10,12,2023));
		System.out.println(obj);
		System.out.println("\nTotal Salary "+obj.calculateSalary());

	}

}
