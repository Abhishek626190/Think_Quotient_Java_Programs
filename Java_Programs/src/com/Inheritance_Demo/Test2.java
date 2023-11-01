package com.Inheritance_Demo;
class Fruit
{
	Fruit()
	{
	System.out.println("1");	
	}
}
class Apple extends Fruit
{
	Apple()
	{
		System.out.println("2");	

	}
}
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Apple();
	}

}
