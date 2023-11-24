package com.Revise;

class Parent
{
	public Object m1()
	{
		return 10;
	}
}
class Child extends Parent{
	public String m1()
	{
		return "Abhi";
	}
	
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		Object o=c.m1();
		String o2=c.m1();

	}

}

