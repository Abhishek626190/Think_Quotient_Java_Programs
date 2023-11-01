package com.Polymorphism;

class Vechile {
	Vechile() {
		System.out.println("Vechile class default constuctor");
		System.out.println(stop());
		System.out.println(run());

	}
	 long mph;

	public void acclerate(long mph) {
		this.mph=mph;
		System.out.println("Vehicle class methos accelerate "+this.mph);
	}

	public String stop() {
		return "STOP";

	}

	public String run() {

		return "RUN";
	}
}

class Car extends Vechile {
	Car() {
		System.out.println("Car class default constuctor");
	}

	public void acclerate(long mph) {
		this.mph=mph;
		System.out.println("Car class method accelerate "+mph);

	}
}

public class Vehicle_Main_Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		c.acclerate(10l);

	}

}
