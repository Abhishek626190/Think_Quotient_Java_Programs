package com.Test_Assignments_30_10_2023;

public class Q_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 obj1=new A1();
		B1 obj2=new B1();
		obj2.i=10;
		obj2.k=90;
		obj1.i=1;
		//obj2.j=2;//error
		obj2.display();
		

	}

}
class A1
{
	public int i;
	private int j;
	protected int k;
}
class B1 extends A1
{
	void display()
	{
		//error 
		//super.j=super.i+1;
		//error
		//System.out.println(super.i+""+super.j);
		//error
		System.out.println("Error in file");
	}
}
