package com.test_01_12_23;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class EmployeeQ3 {
	int id;
	String name;
	Department_Q3 dpt;

	public EmployeeQ3(int id, String name, Department_Q3 dpt) {
		super();
		this.id = id;
		this.name = name;
		this.dpt = dpt;
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

	public Department_Q3 getDpt() {
		return dpt;
	}

	public void setDpt(Department_Q3 dpt) {
		this.dpt = dpt;
	}

	@Override
	public String toString() {
		return "\nEmployeeQ3 [id=" + id + ", name=" + name + ", dpt=" + dpt + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<EmployeeQ3> emplist = new LinkedList<>();

		emplist.add(new EmployeeQ3(101, "Abhi", new Department_Q3(201, "HR", "Pune")));
		emplist.add(new EmployeeQ3(102, "Suraj", new Department_Q3(202, "IT", "Delhi")));
		emplist.add(new EmployeeQ3(103, "Yogesh", new Department_Q3(203, "Sales", "Lucknow")));
		emplist.add(new EmployeeQ3(10, "Dhaani", new Department_Q3(201, "HR", "Pune")));
		emplist.add(new EmployeeQ3(105, "Abhishek", new Department_Q3(204, "Finance", "Pune")));
		System.out.println("Original List***********");
		System.out.println(emplist);
		EmployeeQ3 e1 = null;
		ListIterator<EmployeeQ3> itr = emplist.listIterator();
		while (itr.hasNext()) {
			EmployeeQ3 e = itr.next();
			if (e.id == 10) {
				e1 = e;
			}
 		}
 
		//Found Employee Whose Department id is 10.......
		// System.out.println(e1);
		String str = e1.dpt.name;
 		ArrayList<EmployeeQ3> alist = new ArrayList<>();
		for (EmployeeQ3 e : emplist) {
			if (e.dpt.name.equals(str)) {
				alist.add(e);
			}
		}

		System.out.println(alist);
		emplist.removeAll(alist);
		emplist.add(e1);
		System.out.println(emplist);

	}

}
