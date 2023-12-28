package com.test_08_12_23_Friday_OL;

public class Q8_Student {
	private int id,passingyear;
	private String name,degree;
	private boolean placed;
	
 	public Q8_Student(int id, int passingyear, String name, String degree, boolean placed) {
		super();
		this.id = id;
		this.passingyear = passingyear;
		this.name = name;
		this.degree = degree;
		this.placed = placed;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPassingyear() {
		return passingyear;
	}

	public void setPassingyear(int passingyear) {
		this.passingyear = passingyear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public boolean isPlaced() {
		return placed;
	}

	public void setPlaced(boolean placed) {
		this.placed = placed;
	}

	@Override
	public String toString() {
		return "\nQ8_Student [id=" + id + ", passingyear=" + passingyear + ", name=" + name + ", degree=" + degree
				+ ", placed=" + placed + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
