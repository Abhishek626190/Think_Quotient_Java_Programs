package com.Interface_Demos;

interface False
{
	public void m1();
	static int m2()
	{
		System.out.println("I am in static method of interface False");
		return 5*5;
		
	}
	 
}
public class Demo4 implements False{
	public void m1()
	{
		System.out.println("m1 method implementation in demo4");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		False f=new Demo4();
		f.m1();
		System.out.println(False.m2());

	}

}
