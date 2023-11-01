package com.Containment;

public class Student__ {
	private String name;
	private int rollNum;
	Address__ add;
	Student__()
	{
		add=new Address__();
	}
	Student__(String n,int rn,Address__ add)
	{
		this.name=n;
		this.rollNum=rn;
		this.add=add;
	}
	public void setName(String n)
	{
		this.name=n;
	}
	public void setRollNum(int r)
	{
		this.rollNum=r;
	}
	public String getName()
	{
		return name;
	}
	public int getRollNum()
	{
		return rollNum;
	}
	public String toString()
	{
		return "Student_Name:"+name+"\nRoll_Number:"+rollNum+"\n"+add;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student__ obj=new Student__();
		//System.out.println(obj);
		Address__ obj1=new Address__("Karve_Nagar","Pune","Maharashtra");
		//System.out.println(obj1);
		Student__ obj2=new Student__("Abhi",101,obj1);
		System.out.println(obj2);
		

	}

}
