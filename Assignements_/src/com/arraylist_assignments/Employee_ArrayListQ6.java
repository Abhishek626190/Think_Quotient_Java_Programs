package com.arraylist_assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Employee_ArrayListQ6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<EmployeeQ6>emplist=new ArrayList<>();
		emplist.add(new EmployeeQ6(101, "Salman",15000,
				new DepartmentQ6(601, "IT", "Mumbai")));
		emplist.add(new EmployeeQ6(102, "Amir",18000,
				new DepartmentQ6(602, "Sales", "Delhi")));
		emplist.add(new EmployeeQ6(103, "Sharukh",19000,
				new DepartmentQ6(603, "Finance", "Haryana")));
		emplist.add(new EmployeeQ6(104, "Siraj",13000,
				new DepartmentQ6(605, "Accountant", "Nagpur")));
		emplist.add(new EmployeeQ6(105, "Shami",21000,
				new DepartmentQ6(604, "Trade", "Lucknow")));
		//Iterate through for each.......
//		for(EmployeeQ6 a:emplist)
//		{
//			System.out.println(a);
//		}
		//Iterate through iterator.....
		Iterator<EmployeeQ6>empitr=emplist.iterator();
		while(empitr.hasNext())
		{
			EmployeeQ6 e=empitr.next();
			System.out.println(e);
		}
		System.out.println("***************");
		ArrayList<EmployeeQ6>elist=new ArrayList<>(emplist.size()+5);
//		Collections.copy(elist,emplist);
//		System.out.println(elist);
		// sort by employee name........
		Collections.sort(emplist);
		//System.out.println(emplist);
		// Sort by department name.........
		Employee_Comparator_Q6 obj=new Employee_Comparator_Q6();
		Collections.sort(emplist,obj);
		System.out.println(emplist);
	}

}
