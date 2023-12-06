package com.collection_Master_Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Employee_ArrayList_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee_Q1> alEmp = new ArrayList<Employee_Q1>();
		Employee_Q1 e1 = new Employee_Q1(3, "Ajit");
		Employee_Q1 e2 = new Employee_Q1(4, "Suman");
		Employee_Q1 e3 = new Employee_Q1(2, "Radhika");
		Employee_Q1 e4 = new Employee_Q1(1, "Sameer");
		alEmp.add(e1);
		alEmp.add(e2);
		alEmp.add(e3);
		alEmp.add(e4);
//		Collections.sort(alEmp);
//		Iterator<Employee_Q1> empitr=alEmp.iterator();
//		while(empitr.hasNext())
//		{
//			Employee_Q1 e=empitr.next();
//			System.out.println(e);
//		}

		EmployeeNameComparator_Q2 obj = new EmployeeNameComparator_Q2();
		Collections.sort(alEmp, obj);
		Iterator<Employee_Q1> empitr1 = alEmp.iterator();
		while (empitr1.hasNext()) {
			Employee_Q1 e = empitr1.next();
			System.out.println(e);
		}

	}

}
