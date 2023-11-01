package com.Inheritance_Demo;

public class Manager extends Employee{
	private int noofemp;
	private float bonus;
	Manager()
	{
		noofemp=0;
		bonus=0.0f;
	}
	Manager(int em,float bo,int id,String n,double sal,double p,double d,MyDate_ m)
	{
		super(id,n,sal,p,d,m);
		this.bonus=bo;
		this.noofemp=em;
		
	}
	 public String toString()
	 {
		 return super.toString()+"\nBonus:"+bonus;
	 }
	 public double calculateSalary()
	 {
		 return super.calculateSalary()+bonus;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m=new Manager(15,1000,101,"Abhilasha",45000,10,15,new MyDate_(18,12,2025));
		System.out.println(m);
		System.out.println("Total Salary:"+m.calculateSalary());
	}

}
