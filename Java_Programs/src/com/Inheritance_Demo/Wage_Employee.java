package com.Inheritance_Demo;

public class Wage_Employee extends Employee{
	private int hrs;
	private float rate;
	Wage_Employee()
	{
		
	}
	Wage_Employee(int hours,float rate,int id,String name,double sal,double pf,double da,MyDate_ m)
	{	
		super(id,name,sal,pf,da,m);
		this.hrs=hours;
		this.rate=rate;
		
		
	}
	public String toString ()
	{
		return super.toString()+"\nHours:"+hrs+"\nRate:"+rate+"%";
	}
	public double calculateSalary()
	{
		return super.calculateSalary()+hrs*rate;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wage_Employee obj1=new Wage_Employee(5,7.5f,101,"Abhijeet",25000,10,15,new MyDate_(18,10,2023));
		System.out.println(obj1);
		System.out.println("Total_Salary "+obj1.calculateSalary());
	}

}
