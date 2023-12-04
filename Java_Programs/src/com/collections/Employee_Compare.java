package com.collections;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Employee_Compare implements Comparable<Employee_Compare> {
	Scanner sc = new Scanner(System.in);
	int id, age;
	String name;
	String designation;
	double salary;
	Department_Compare dpt;

	Employee_Compare() {

	}

	public Employee_Compare(int id, int age, String name, String designation, double salary, Department_Compare dpt) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.dpt = dpt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department_Compare getDpt() {
		return dpt;
	}

	public void setDpt(Department_Compare dpt) {
		this.dpt = dpt;
	}

	@Override
	public String toString() {
		return "\nEmployee_Details [id=" + id + ", age=" + age + ", name=" + name + ", designation=" + designation
				+ ", salary=" + salary + " " + dpt + "]";
	}

// sort by id..............
//	@Override
//	public int compareTo(Employee_Compare o) {
//		// TODO Auto-generated method stub
//		if (this.getId() == o.getId())
//			return 0;
//		else if (this.getId() > o.getId())
//			return 1;
//		else
//			return -1;
//	}
	// sort by name...........
//	@Override
//	public int compareTo(Employee_Compare o) {
//		// TODO Auto-generated method stub
//		int res = this.getName().compareTo(o.getName());
//		return res;
//	}
	// sort by age..............
//	@Override
//	public int compareTo(Employee_Compare o) {
//		// TODO Auto-generated method stub
//		if (this.getAge() == o.getAge())
//			return 0;
//		else if (this.getAge() > o.getAge())
//			return 1;
//		else
//			return -1;
//	}
	//// Sort employee id by their name if two employee having same name then sort
	//// by salary
	// @Override
//	public int compareTo(Employee_Compare o) {
//		// TODO Auto-generated method stub
//		if (this.getSalary() == o.getSalary())
//			return this.getName().compareTo(o.getName());
//		else if (this.getSalary() > o.getSalary())
//			return 1;
//		else
//			return -1;
//	}
	// Sort by location...........
//	@Override
//	public int compareTo(Employee_Compare o) {
//		// TODO Auto-generated method stub
//		int res = this.dpt.getLocation().compareTo(o.dpt.getLocation());
//		return res;
//	}
	// sort by designation...........
//	@Override
//	public int compareTo(Employee_Compare o) {
//		// TODO Auto-generated method stub
//		int res = this.getDesignation().compareTo(o.getDesignation());
//		return res;
//	}
	@Override
	public int compareTo(Employee_Compare o) {
		// TODO Auto-generated method stub
		Integer i = this.id;
		Integer j = o.id;
		Integer k = i.compareTo(j);
		return k;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee_Compare empobj = new Employee_Compare();

		Department_Compare dpt1 = new Department_Compare(101, "IT", "Pune");
		Department_Compare dpt2 = new Department_Compare(102, "HR", "Nanded");
		Department_Compare dpt3 = new Department_Compare(103, "IT", "Pandarpur");
		Department_Compare dpt4 = new Department_Compare(104, "Finance", "Baramati");
		Department_Compare dpt5 = new Department_Compare(105, "Testing", "NaviMumbai");
		Department_Compare dpt6 = new Department_Compare(106, "Finance", "NaviMumbai");

		ArrayList<Employee_Compare> emplist = new ArrayList<>(Arrays.asList());
		emplist.add(new Employee_Compare(201, 22, "Abhishek", "BackEnd Developer", 150000, dpt1));
		emplist.add(new Employee_Compare(205, 27, "Adarsh", "FrontEndDeveloper", 100000, dpt2));
		emplist.add(new Employee_Compare(204, 26, "Bhakti", "FullStack Developer", 250000, dpt3));
		emplist.add(new Employee_Compare(203, 23, "Suraj", "Junior Developer", 150000, dpt4));
		emplist.add(new Employee_Compare(202, 25, "Pirtam", "Senior Developer", 150500, dpt5));
		emplist.add(new Employee_Compare(206, 24, "Suraj", "Project Manager", 105000, dpt6));

		System.out.println("Before Sorting");
		System.out.println(emplist);
		System.out.println("**************");

		// Collections.sort(emplist);
		// Collections.reverse(emplist);
		System.out.println("After Sorting");
		// System.out.println(emplist);
// Sort employee id by their name if two employee having same name then sort by salary
//		EmployeeComparatorUsingName obj = new EmployeeComparatorUsingName();
//		Collections.sort(emplist, obj);
//		System.out.println(emplist);
//		System.out.println("**************");
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter department name");
//		String name = sc.next();
//		// Employee name who is in Same Department
//		for (int i = 0; i < emplist.size(); i++) {
//			if (emplist.get(i).dpt.name.equals(name)) {
//				System.out.println(emplist.get(i));
//			}
//		}
		// 10. Employee name whose character start with"X"
//		System.out.println("********************");
//		System.out.println("Enter Character to find name starts with: ");
//		char ch = sc.next().charAt(0);
//
//		for (int i = 0; i < emplist.size(); i++) {
//			if (emplist.get(i).name.charAt(0) == Character.toUpperCase(ch)) {
//				System.out.println(emplist.get(i));
//			}
//		}
		// 09. salary of employee who is working in "X" Department
//		System.out.println("enter department name");
//		String dptname = sc.next();
//		double max = 0;
//		// Employee name who is in Same Department
//		for (int i = 0; i < emplist.size(); i++) {
//			if (emplist.get(i).dpt.name.equals(dptname)) {
//				if (max < emplist.get(i).salary)
//					max = emplist.get(i).salary;
//
//			}
//		}
//		System.out.println("Maximum Salary of " + dptname+"Department is"+max);
	}

}
