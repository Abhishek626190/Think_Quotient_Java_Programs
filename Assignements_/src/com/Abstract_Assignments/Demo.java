package com.Abstract_Assignments;
//Assignment check
public abstract class Demo implements i1,i2{
	public abstract void m1();
	public void m2(){
		System.out.println("M2 method in demo class");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("An class with abstract without any method");

	}

}
//interface i extends Demo
//{
// interface can not extends class
//}
interface i1
{
	public void m3();
}
interface i2
{
	public void m4();
}
