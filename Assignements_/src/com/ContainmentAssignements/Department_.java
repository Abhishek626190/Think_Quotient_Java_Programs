package com.ContainmentAssignements;

public class Department_ {
	private String dName;
	private int dId;
	public Department_() {
		// TODO Auto-generated constructor stub
	}
	Department_(String name,int id)
	{
		this.dName=name;
		this.dId=id;
	}
	public void setId(int i)
	{
		this.dId=i;
 	}
	public int getId()
	{
		return dId;
	}
	public void setName(String na)
	{
		this.dName=na;
 	}
	public String getName( )
	{
		return dName;
 	}
	public String toString()
	{
		return "\nDepartment_Name:"+dName+"\nDepartment_Id:"+dId;
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department_ obj=new  Department_();
		System.out.println(obj);
 		MyDate obj2=new MyDate();


		

	}

}
