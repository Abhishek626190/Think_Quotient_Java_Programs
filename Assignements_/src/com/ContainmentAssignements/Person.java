package com.ContainmentAssignements;

public class Person {
	private String name, gender;
	private int age;
	Address add;

	Person() {

	}

	Person(String n, int a, String g, Address ad) {
		this.name = n;
		this.age = a;
		this.gender = g;
		this.add = ad;

	}

	public void setName(String n) {
		this.name = n;
	}

	public void setAge(String a) {
		this.name = a;
	}

	public void setGender(String g) {
		this.gender = g;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public String toString() {
		return "Name:" + name + "\nAge:" + age + "\nGender:" + gender + "\nAddress****\n" + add;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method
		//Person obj = new Person();
		Address a=new Address("Karve_Nagar","Maharashtra","INDIA");
		Person obj1 = new Person("Abhi",23,"Male",a);

		System.out.println(obj1);

	}

}
