package com.Test_Assignments_06_11_2023;

import java.util.Arrays;

public class Person_Q_9 {
	private int id;
	private String name;
	Vehicle_Q_9 v[];

	public Person_Q_9(int i, String n, Vehicle_Q_9 a[]) {
		// TODO Auto-generated constructor stub
		this.id = i;
		this.name = n;
		this.v = a;
	}

	public void setId(int i) {
		this.id = i;
	}

	public int getId() {
		return id;
	}

	public void setName(String n) {
		this.name = n;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return "\nPerson Id:" + id + " Person Name:" + name + Arrays.toString(v);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle_Q_9 arr[] = new Vehicle_Q_9[3];

		arr[0] = new Vehicle_Q_9(101, "Pulsar");
		arr[1] = new Vehicle_Q_9(102, "Apachee");
		arr[2] = new Vehicle_Q_9(103, "Yamaha");
		Person_Q_9 p[] = new Person_Q_9[3];
		p[0] = new Person_Q_9(201, "Abhishek", arr);
		p[1] = new Person_Q_9(202, "Abhi", arr);
		p[2] = new Person_Q_9(203, "Abhinash", arr);
		System.out.println(Arrays.toString(p) + "\n");

	}

}
