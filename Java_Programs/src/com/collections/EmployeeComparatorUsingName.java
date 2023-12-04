package com.collections;

import java.util.Comparator;

public class EmployeeComparatorUsingName implements Comparator<Employee_Compare> {
//	@Override
//	public int compare(Employee_Compare o1, Employee_Compare o2) {
//		// TODO Auto-generated method stub
//		Integer i = o1.getAge();
//		Integer j = o2.getAge();
//		return i.compareTo(j);
//	}

	public int compare(Employee_Compare o1, Employee_Compare o2) {
		// TODO Auto-generated method stub
		Integer res = o1.getName().compareTo(o2.getName());
		Double d = o1.getSalary();
		Double d1 = o2.getSalary();

		if (o1.getName().equals(o2.getName()))
			return d.compareTo(d1);
		if (res == 0)
			return d.compareTo(d1);
		else
			return o1.getName().compareTo(o2.getName());

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
