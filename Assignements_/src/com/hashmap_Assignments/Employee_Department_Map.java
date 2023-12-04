package com.hashmap_Assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Scanner;

public class Employee_Department_Map {
	public static double findMaxSalary(ArrayList<Employee> elist) {
		double max = elist.get(0).getSalary();
		for (int i = 1; i < elist.size(); i++) {
			if (max < elist.get(i).getSalary()) {
				max = elist.get(i).getSalary();
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department d1 = new Department(801, "HR", "Pune");
		Department d2 = new Department(802, "Sales", "Mumbai");
		Department d3 = new Department(803, "IT", "Delhi");
		Department d4 = new Department(804, "Finance", "Nagpur");
		Department d5 = new Department(805, "Testing", "Lucknow");

		ArrayList<Employee> emplist = new ArrayList<>();
		emplist.add(new Employee(1, "Abhi", 74000, 801));
		emplist.add(new Employee(2, "Suraj", 11000, 801));
		emplist.add(new Employee(3, "Yogesh", 12000, 801));
		emplist.add(new Employee(4, "Priya", 13000, 801));
		emplist.add(new Employee(5, "Dhaani", 14000, 801));

		ArrayList<Employee> emplist1 = new ArrayList<>();
		emplist1.add(new Employee(6, "Sunish", 10000, 802));
		emplist1.add(new Employee(7, "Suraj", 11000, 802));
		emplist1.add(new Employee(8, "Pritam", 76000, 802));

		ArrayList<Employee> emplist2 = new ArrayList<>();
		emplist2.add(new Employee(9, "Sudarshan", 21000, 803));
		emplist2.add(new Employee(19, "Aadarsh", 29000, 803));
		emplist2.add(new Employee(10, "Ishwar", 20000, 803));
		emplist2.add(new Employee(11, "Utkarsha", 71000, 803));

		ArrayList<Employee> emplist3 = new ArrayList<>();
		emplist3.add(new Employee(12, "Snehal", 21500, 804));
		emplist3.add(new Employee(13, "Harshal", 18700, 804));
		emplist3.add(new Employee(14, "Nishank", 75300, 804));

		ArrayList<Employee> emplist4 = new ArrayList<>();
		emplist4.add(new Employee(15, "Maruti", 77500, 805));
		emplist4.add(new Employee(16, "Prashant", 16500, 805));
		emplist4.add(new Employee(17, "Ulka", 15800, 805));

		HashMap<Department, ArrayList<Employee>> empmap = new HashMap<>();
		empmap.put(d1, emplist);
		empmap.put(d2, emplist1);
		empmap.put(d3, emplist2);
		empmap.put(d4, emplist3);
		empmap.put(d5, emplist4);
		System.out.println("*******************");
		// 1. Employee Details with Department wise
//		for(Entry<Department,ArrayList<Employee>>em:empmap.entrySet())
//		{
//			System.out.println(em.getKey()+"\n"+em.getValue());
//		}
//		System.out.println("****************");
		// 1.1 Employee Details WIth Department Wise
//		Set<Entry<Department,ArrayList<Employee>>>empset=empmap.entrySet();
//		Iterator<Entry<Department,ArrayList<Employee>>>empitr=empset.iterator();
//		while(empitr.hasNext())
//		{
//			Entry<Department,ArrayList<Employee>> e=empitr.next();
//			Department obj=e.getKey();
//			System.out.println(obj.name+" "+obj.id);
//			ArrayList<Employee>empal=e.getValue();
//			Iterator<Employee>empitr1=empal.iterator();
//			while(empitr1.hasNext())
//			{
//				Employee e1=empitr1.next();
//				System.out.println(e1);
//			}
//		}
		// 2. Display Maximum Salary Along with Department in all Department
//		Set<Entry<Department, ArrayList<Employee>>> empset = empmap.entrySet();
//   	Iterator<Entry<Department, ArrayList<Employee>>> itr = empset.iterator();
//		while (itr.hasNext()) {
//			Entry<Department, ArrayList<Employee>> e = itr.next();
//			System.out.println("Department Name :" + e.getKey().getName());
//			System.out.println("following list who earn max sal");
//			Iterator<Employee> elitr = e.getValue().iterator();
//			while (elitr.hasNext()) {
//				Employee e11 = elitr.next();
//
//				if (e11.getSalary() == findMaxSalary(e.getValue())) {
//					System.out.println(e11);
//				}
//			}
// 			System.out.println();
// 		}
		// System.out.println("Through For Each:");
//		for (Entry<Department, ArrayList<Employee>> em : empmap.entrySet()) {
//			// System.out.println(em.getKey()+":"+em.getValue());
//			Iterator<Employee> emp = em.getValue().iterator();
//			System.out.println("Department Name :" + em.getKey().getName());
//			System.out.println("following list who earn max salary");
//			while (emp.hasNext()) {
//				Employee e = emp.next();
//				if (e.getSalary() == findMaxSalary(em.getValue())) {
//					System.out.println(e);
//				}
//			}
//			System.out.println();
//		}
		// 2.1 Display Maximum Salary Along with Department in all Department
//		Set<Entry<Department,ArrayList<Employee>>>empset=empmap.entrySet();
//		Iterator<Entry<Department,ArrayList<Employee>>>empitr=empset.iterator();
//		while(empitr.hasNext())
//		{
//			Entry<Department,ArrayList<Employee>>e=empitr.next();
//			Department obj=e.getKey();
//			System.out.println(obj.getName()+" "+obj.getId());
//			ArrayList<Employee>empal=e.getValue();
//			Iterator<Employee>empitr1=empal.iterator();
//			double maxSal=0;
//			Employee obj1=null;
//			while(empitr1.hasNext())
//			{
//				Employee e1=empitr1.next();
//				if(maxSal<e1.getSalary())
//				{
//					maxSal=e1.getSalary();
//					obj1=e1;
//				}
// 			}
//			System.out.println("Maximum Salary Is: "+maxSal+" Employee Name: "+obj1.getName());
//			System.out.println("************");
//		}
		// 7.Whose salary greater than 70k
//		Set<Entry<Department, ArrayList<Employee>>> empstr = empmap.entrySet();
//		Iterator<Entry<Department, ArrayList<Employee>>> empitr = empstr.iterator();
//		while (empitr.hasNext()) {
//			Entry<Department, ArrayList<Employee>> e = empitr.next();
//			Department obj = e.getKey();
//			System.out.println(obj.getName() + " " + obj.getId());
//			ArrayList<Employee> empal = e.getValue();
//			Iterator<Employee> empitr1 = empal.iterator();
//			while (empitr1.hasNext()) {
//				Employee e1 = empitr1.next();
//				if (e1.getSalary() > 70000) {
//					System.out.println(e1);
//				}
//			}
//		}
		// 8. Display employee who work in "xxx" location
//		Set<Entry<Department,ArrayList<Employee>>>empset=empmap.entrySet();
//		Iterator<Entry<Department,ArrayList<Employee>>>empitr=empset.iterator();
//		while(empitr.hasNext())
//		{
//			Entry<Department,ArrayList<Employee>>e1=empitr.next();
//			Department e=e1.getKey();
//			//System.out.println(e.getName()+" "+e.getId());
//			ArrayList<Employee>empal=e1.getValue();
//			Iterator<Employee>empitr1=empal.iterator();
//			while(empitr1.hasNext())
//			{
//				Employee e2=empitr1.next();
// 				 if(e.getLocaion().equals("Pune"))
// 				 {
// 					 System.out.println(e2+""+e.getLocaion());
// 				 }
//			}
//			
//			
//		}
		// Add Employee In "xxxx" department
		Set<Entry<Department, ArrayList<Employee>>> empset = empmap.entrySet();
		Iterator<Entry<Department, ArrayList<Employee>>> empitr = empset.iterator();
		while (empitr.hasNext()) {
			Entry<Department, ArrayList<Employee>> e = empitr.next();
			Department obj = e.getKey();
			if (obj.getName().equals("Testing")) {
				ArrayList<Employee> elist = e.getValue();
				// System.out.println(elist);
				Employee eo = new Employee(18, "Sneha", 45820, 805);
				elist.add(eo);
				// System.out.println(elist);
				empmap.put(obj, elist);
				// System.out.println(empmap.get(new Department(802, "HR", "Pune")));
				// System.out.println(empmap);
			}
			ArrayList<Employee> empal = e.getValue();
			Iterator<Employee> empitr1 = empal.iterator();
			while (empitr1.hasNext()) {
				Employee em1 = empitr1.next();
				if (obj.name.equals("Testing")) {
					System.out.println(em1);
 				}
			}
		}
		System.out.println("****************");
//		 3. Display All Employee From "xxx" Department who is having
//		 salary less than 70K
//		for (Entry<Department, ArrayList<Employee>> em : empmap.entrySet()) {
//			Iterator<Employee> emp = em.getValue().iterator();
//			while (emp.hasNext()) {
//				Employee e = emp.next();
//				if (em.getKey().getName() == "IT") {
//					if (e.getSalary() < 70000)
//						System.out.println(e);
//				}
//			}
// 		}
		// System.out.println("****************");
		// 6.Display All Employees Whose Name Start with 'X'
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Character to find employee details");
//		char ch = sc.next().charAt(0);
//		for (Entry<Department, ArrayList<Employee>> em : empmap.entrySet()) {
//			Iterator<Employee> emp = em.getValue().iterator();
//			while (emp.hasNext()) {
//				Employee e = emp.next();
//				if (e.getName().charAt(0) == Character.toUpperCase(ch)) {
//					System.out.println(e + "" + em.getKey());
//				}
//			}
//		}
	}

}
