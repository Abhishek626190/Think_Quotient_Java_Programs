package com.arraylist_assignments;

import java.util.Comparator;

public class Employee_Comparator_Q6 implements Comparator<EmployeeQ6>{
	
	public int compare(EmployeeQ6 e1,EmployeeQ6 e2)
	{
		return e1.dpt.getName().compareTo(e2.dpt.getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
