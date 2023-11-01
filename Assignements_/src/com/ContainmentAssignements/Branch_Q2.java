package com.ContainmentAssignements;

public class Branch_Q2 {
	private int id;
	private String name;

	Branch_Q2() {

	}

	Branch_Q2(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public String toString()
	{
		return "Id:"+id+"\nName:"+name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Branch_Q2 obj = new Branch_Q2(201, "MCA");
		System.out.println(obj);

	}

}
