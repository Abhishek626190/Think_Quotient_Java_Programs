package com.Overloading;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Car();
		c1.color="Blue";
		//System.out.println(c1.color);
		Car c2=new Car();
		c2.changeColor(c1);
		c2.color="Pink";
		System.out.println(c1.color);
		System.out.println(c2.color);

	}

}
class Car
{
	String color;
	public void changeColor(Car c2)
	{
		c2.color=color;
		color="red";
	}
}
