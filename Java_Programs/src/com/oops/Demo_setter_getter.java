package com.oops;

public class Demo_setter_getter {
	private int age;
	private String name;

	public void setAge(int age) {
		this.age=age;

	}

	public void setName(String name) {
		this.name=name;

	}
	public int getAge()
	{
		return age;
	}
	public String getName()
	{
		return name;
	}
	public void displayData()
	{
		System.out.println(age);
		System.out.println(name);

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo_setter_getter obj=new Demo_setter_getter();
		obj.setAge(23);
		obj.setName("Abhi");
		obj.getAge();
		obj.getName();
 		obj.displayData();
		

	}

}
