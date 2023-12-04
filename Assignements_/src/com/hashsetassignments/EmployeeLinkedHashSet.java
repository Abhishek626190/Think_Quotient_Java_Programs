package com.hashsetassignments;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class EmployeeLinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj1=new Employee(101, "Abhi");
		Employee obj2=new Employee(105, "Suraj");
		Employee obj3=new Employee(102, "Ishwar");
		Employee obj4=new Employee(101, "Abhi");
		Employee obj5=new Employee(104, "Aadarsh");
		
		LinkedHashSet<Employee>lhs=new LinkedHashSet<>();
		lhs.add(obj1);
		lhs.add(obj2);
		lhs.add(obj3);
		lhs.add(obj4);
		lhs.add(obj5);
		Iterator<Employee>itr=lhs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
