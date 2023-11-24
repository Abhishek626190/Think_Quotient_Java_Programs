package com.inheritance_PracticeTest;

public class Predict_Output_Q1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		c1.color = "Blue";
		Car c2 = new Car();
		c2.color = "Pink";
		changeColor(c1);
		System.out.println(c1.color);
		System.out.println(c2.color);

	}

	public static void changeColor(Car c1) {
		c1.color = "Yellow";
	}

}

class Car {
	String name;
	static String color = "White";
}
