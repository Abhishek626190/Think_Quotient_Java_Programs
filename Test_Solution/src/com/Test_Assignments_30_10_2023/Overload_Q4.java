package com.Test_Assignments_30_10_2023;

public class Overload_Q4 {
	public void volume()
	{
		
	}
	public double volume(double r)
	{
		double v;
		return v=((4/3)*(22/7)*(r*r*r));
	}
	public double volume(double r,double h)
	{
		double v;
		return v=(22/7)*(r*r+h);
	}
	public double volume(double l,double b,double h)
	{
		double v;
		return v=l*b*h;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overload_Q4 obj=new Overload_Q4();
		System.out.println(obj.volume(5));
		System.out.println(obj.volume(5, 10));
		System.out.println(obj.volume(5, 10, 20));

	}

}
