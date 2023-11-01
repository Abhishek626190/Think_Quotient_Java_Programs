package com.Abstract_Demos;

public abstract class Shape {
	Shape() {

	}

	final float pi = 3.14f;

	abstract void calculateArea();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Circle c=new Circle();
		// c.area(5f);
		Shape s[] = new Shape[2];
		s[0] = new Circle(5f);
		s[1] = new Rectangle(10f, 15f);
		for (Shape i : s) {
			i.calculateArea();
		}

	}

}

class Circle extends Shape {
	float rad;

	Circle(float r) {
		this.rad = r;
	}

	void calculateArea() {

		System.out.println(pi * rad * rad);
	}
}

class Rectangle extends Shape {
	float leng, brea;

	Rectangle(float l, float b) {
		this.leng = l;
		this.brea = b;

	}

	public void calculateArea() {

		System.out.println(leng * brea);

	}

}
