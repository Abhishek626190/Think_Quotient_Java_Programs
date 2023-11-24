package com.collections;

public class Department {
	String name;
	int id;

	public Department(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Department [name=" + name + ", id=" + id + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department obj = new Department("Technical", 101);
		Department obj1 = new Department("Testing", 102);
		Department obj2 = new Department("Debugger", 103);
		System.out.println(obj);
		System.out.println(obj1);
		System.out.println(obj2);

	}

}
