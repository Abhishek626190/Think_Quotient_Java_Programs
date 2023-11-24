package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Employee implements Comparable<Employee> {
	int id;
	String name;
	Department d;

	public Employee(int id, String name, Department d) {
		super();
		this.id = id;
		this.name = name;
		this.d = d;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getD() {
		return d;
	}

	public void setD(Department d) {
		this.d = d;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", d=" + d + "]";
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		int res = this.name.compareTo(o.name);
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1 = new Employee(201, "Abhi", new Department("Development", 101));
		Employee emp2 = new Employee(202, "Suraj", new Department("Tester", 102));
		Employee emp3 = new Employee(203, "Pritam", new Department("Debugger", 103));

		ArrayList<Employee> emp = new ArrayList<>(Arrays.asList(emp1, emp2, emp3));
		// System.out.println(emp);
		ArrayList<Employee> em = new ArrayList<>(Collections.nCopies(emp.size(), null));

		Collections.copy(em, emp);
		System.out.println(emp);

//		ArrayList<Employee> emp1 = new ArrayList<>(
//				Arrays.asList(new Employee(201, "Abhishek", new Department("HR", 101))));
//		Iterator<Employee> itr = emp.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		emp2.getD().name = "HR";
		//System.out.println(em);
		Collections.sort(emp);
		System.out.println(emp);

	}

}
