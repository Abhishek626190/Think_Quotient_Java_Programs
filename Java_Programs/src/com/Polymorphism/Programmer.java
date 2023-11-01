package com.Polymorphism;

public class Programmer {
	int hr;
	 
	public void workingHours(int h)
	{
		this.hr=h;
		System.out.println("Working Hours Of Programmer is:"+hr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		Programmer p=new Programmer();
		Programmer e1=new Employee();
		e.workingHours(10);
		p.workingHours(20);
		e1.workingHours(15);

	}

}
class Employee extends Programmer
{
	public void workingHours(int h)
	{
		this.hr=h;
		System.out.println("Working Hours Of Employee is:"+hr);
	}
}
