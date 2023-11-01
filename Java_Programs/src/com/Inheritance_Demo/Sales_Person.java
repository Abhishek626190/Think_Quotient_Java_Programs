package com.Inheritance_Demo;

public class Sales_Person extends Employee  {
	private int commission;
	private int sale;

	Sales_Person() {

	}

	Sales_Person(int sale, int comm, int hours, float rate, int id, String name, double sal, double pf, double da,
			MyDate_ m) {
		super(id, name, sal, pf, da, m);
		this.sale = sale;
		this.commission = comm;

	}
	public String toString()
	{
		return super.toString()+"\nSale:"+sale+"\nCommission:"+commission;
	}
	public double calculateSalary()
	{
		return super.calculateSalary()+sale*commission;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sales_Person obj2=new Sales_Person(5,1000,8,7.5f,103,"Abhinav",10000,10,15,new MyDate_(15,12,2023));
		System.out.println(obj2);
		System.out.println("Total_Salary "+obj2.calculateSalary());

	}

}
