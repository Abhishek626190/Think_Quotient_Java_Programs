package com.inheritance_PracticeTest;

interface A{
	void myMethod();
}
class B{
	public void myMethod(){
		System.out.println("My Method");
		
	}
}
class C extends B implements A{
	
}
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new C();
		a.myMethod();
	}

}

