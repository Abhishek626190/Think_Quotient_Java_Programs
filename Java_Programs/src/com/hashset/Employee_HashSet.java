package com.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Employee_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj1 = new Employee(101, "Shami", 15000);
		Employee obj2 = new Employee(102, "Siraj", 18000);
		Employee obj3 = new Employee(103, "Bumrah", 13000);
		Employee obj4 = new Employee(104, "Kuldeep", 11000);
		Employee obj5 = new Employee(105, "Ravindra", 17000);
		Employee obj6 = new Employee(105, "Ravindra", 17000);

		HashSet<Employee> emphs = new HashSet<>();
		emphs.add(obj1);
		emphs.add(obj2);
		emphs.add(obj3);
		emphs.add(obj4);
		emphs.add(obj5);
		emphs.add(obj1);
		emphs.add(obj6);

		Iterator<Employee> empitr = emphs.iterator();
		while (empitr.hasNext()) {
			Employee e = empitr.next();
			System.out.println(e);
		}

		// System.out.println(emphs.getClass());

	}

}
