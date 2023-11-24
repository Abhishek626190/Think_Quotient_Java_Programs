package com.inheritance_PracticeTest;

class A1
{
	{
		System.out.println("1");
	}
}
class B1 extends A1
{
	{
		System.out.println("2");
	}
}
class C1 extends B1
{
	{
		System.out.println("3");
	}
}
public class Q5_Predict_OutPut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1 c=new C1();

	}

}
