package com.test_02_12_23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj1=new Employee("Ankit");
		Employee obj2=new Employee("Bard");
		ArrayList<Employee>list=new ArrayList<>();
		list.add(obj1);
		list.add(obj2);
		
		Collections.sort(list,new Employee.ComparatorName());
		System.out.println(list);

	}

}
class Employee{
	String name;
	public Employee()
	{
		
	}
	public Employee(String name)
	{
		this.name=name;
	}
	public String toString()
	{
		return "name="+name;
	}
	static class ComparatorName implements Comparator<Employee>
	{
		public int compare(Employee e1,Employee e2)
		{
			return e1.name.compareTo(e2.name);
		}
	}
}
