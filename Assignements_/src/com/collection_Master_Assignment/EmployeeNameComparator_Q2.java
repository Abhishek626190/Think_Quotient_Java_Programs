package com.collection_Master_Assignment;

import java.util.Comparator;

public class EmployeeNameComparator_Q2 implements Comparator<Employee_Q1>{
	public int compare(Employee_Q1 e1,Employee_Q1 e2)
	{
		return e1.getName().compareTo(e2.getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
