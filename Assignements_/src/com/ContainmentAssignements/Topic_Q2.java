package com.ContainmentAssignements;

public class Topic_Q2 {

	private int id;
	private String name;

	Topic_Q2() {

	}

	Topic_Q2(int id, String name) {
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

	public String toString() {
		return "Id:" + id + "\nName:" + name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Topic_Q2 obj = new Topic_Q2(401, "Exception");
		System.out.println(obj);
	}

}
