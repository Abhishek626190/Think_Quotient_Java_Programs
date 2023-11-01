package com.Polymorphism;

class Bike {
	  float speed;
	  String color;

	public void bikeInfo(float s, String c) {
		this.speed = s;
		this.color = c;
		System.out.println("Speed of Bike is:" + speed);
		System.out.println("Color of Bike is:" + color);

	}
}
class Pulsar extends Bike
{	@Override
	public void bikeInfo(float s, String c) {
		 this.speed=s;
		 this.color=c;
		 
		System.out.println("Speed of Bike is:" + speed);
		System.out.println("Color of Bike is:" + color);

	}
}

public class Bike_Main_Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b=new Bike();
		Pulsar p=new Pulsar();
		Bike b1=new Pulsar();
		b.bikeInfo(45, "Red");
		p.bikeInfo(65, "Blue");
		b1.bikeInfo(55, "Grey..");


		
		

	}

}
