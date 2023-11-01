package com.Polymorphism;
class Shape
{
	Shape()
	{
		System.out.println("Shape class default constructor");

	}
	public void draw()
	{
		System.out.println("Shape draw method");
	}
}
class Circle extends Shape
{
	Circle()
	{
		System.out.println("Circle class default constructor");

	}
	public void draw()
	{
		System.out.println("Circle draw method");

	}
}
class Rectangle extends Shape
{
	Rectangle()
	{
		System.out.println("Rectangle class default constructor");

	}
	public void draw()
	{
		System.out.println("Rectangle draw method");

	}
}
class Square extends Shape
{
	Square()
	{
		System.out.println("Square class default constructor");
	
	}
	public void draw()
	{
		System.out.println("Square draw method");

	}
}
public class Shape_Main_Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle();
		Square s=new Square();
		Rectangle r=new Rectangle();
		c.draw();
		s.draw();
		r.draw();

	}

}
