package com.Test_Assignments_30_10_2023;

public class Person_Q5 {
	int id;
	String name;
	long mobile;
	Job job;
	public Person_Q5(int i,String n,long m,Job j) {
		// TODO Auto-generated constructor stub
		this.id=i;
		this.name=n;
		this.mobile=m;
		this.job=j;
	}
	public void setId(int i)
	{
		this.id=i;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String n)
	{
		this.name=n;
		
	}
	public String getName()
	{
		return name;
	}
	public void setMobile(long m)
	{
		this.mobile=m;
	}
	public long getRole()
	{
		return mobile;
	}
	public String toString()
	{
		return "Id:"+id+"\nName:"+name+"\nMobile_Number:"+mobile+job;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Job j=new Job(201,"Developer",150000);
		Person_Q5 obj=new Person_Q5(101, "Abhi", 6261904221l, j);
		System.out.println(obj);

	}

}
class Job
{
	int id;
	String role;
	double salary;
	Job(int i,String r,double s)
	{
		this.id=i;
		this.role=r;
		this.salary=s;
	}
	public void setId(int i)
	{
		this.id=i;
	}
	public int getId()
	{
		return id;
	}
	public void setSalary(double s)
	{
		this.salary=s;
		
	}
	public double getSalary()
	{
		return salary;
	}
	public void setRole(String r)
	{
		this.role=r;
	}
	public String getRole()
	{
		return role;
	}
	public String toString()
	{
		return "\nJob_Id:"+id+"\nRole:"+role+"\nSalary:"+salary;
	}
}
