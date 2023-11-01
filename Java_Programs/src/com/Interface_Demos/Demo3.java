package com.Interface_Demos;

interface True
{
	public void m1();
	default void m2()
	{
		System.out.println("M2 method in interface I");
	}
}
public class Demo3 implements True {
	public void m1()
	{
		System.out.println("M1 method implementation in demo3 class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo3 d=new Demo3();
		d.m1();
		d.m2();
		
		

	}

}
