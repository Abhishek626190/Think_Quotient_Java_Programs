package com.innerClasses;

public class OuterMethodArg {

	int data_n=10;
	public OuterMethodArg() {
		// TODO Auto-generated constructor stub
	}
	public void showData(Demo1 obj)
	{
		obj.show();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OuterMethodArg obj=new OuterMethodArg();
		Demo1 d=new Demo1();
		obj.showData(d);
		
		obj.showData(new Demo1() {
			
			// A.I.C sub class Demo
			
		});

	}

}

class Demo1
{
	int data=10;
	public Demo1() {
		// TODO Auto-generated constructor stub
	}
	public void show()
	{
		System.out.println("In show() of Demo class");
	}
}


