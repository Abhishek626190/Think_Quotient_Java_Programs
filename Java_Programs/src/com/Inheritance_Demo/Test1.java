package com.Inheritance_Demo;
class Vehicle
{
	int speed=40;
	
}
class Car extends Vehicle
{
	
	int speed=80;
	public void displaySpeed()
	{
		System.out.println(super.speed);
		System.out.println(speed);
	}
}
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c=new Car();
		c.displaySpeed();

	}

}
