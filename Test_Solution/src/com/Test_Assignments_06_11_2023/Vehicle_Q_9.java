package com.Test_Assignments_06_11_2023;

public class Vehicle_Q_9 {
	private int vid;
	private String vname;

	public Vehicle_Q_9() {
 		this.vid = 0;
		this.vname = "";
  	}
	public Vehicle_Q_9(int i,String n)
	{
		this.vid=i;
		this.vname=n;
	}
	public void setId(int i)
	{
		this.vid=i;
	}
	public int getId()
	{
		return vid;
	}
	public void setName(String n)
	{
		this.vname=n;
	}
	public String getName()
	{
		return vname;
	}
	public String toString()
	{
		return "\nVechile Id:"+vid+" Vehicle Name:"+vname;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle_Q_9 obj=new Vehicle_Q_9(101,"Pulsar");
		System.out.println(obj);

	}

}
