package com.Assignments_Array_Object;

//import java.util.Scanner;

public class Print_Employees {
	Employee e[];// Array object of Employee
	MyDate m[]; // Array object of MyDate
	Department_Q3 d[]; // Array object of Department_Q3
	int ide;// take user input

	// Default Constructor
	Print_Employees() {
	}

	// Parameterized Constructor
	Print_Employees(Employee em[]) {
		this.e = em;
		// this.m = md;
		// this.ee = el;
	}

	public void setEmp(Employee emp[]) {// setter method
		this.e = emp;
	}

	public Employee[] getEmp() {// getter method
		return e;
	}

	// ***************************************
	// display employee details,department details,date of joining
	public void displayEmployeeDepartmnet() {
		for (Employee i : e) {
			System.out.println(i);
		}
	}
	// ************************************
	// display employees with same salary
//	public void displayEmployee() {
////		for (Employee a : e)
////			System.out.println(a);
//		double max = 0;
//		String nam = " ";
//		for (Employee a1 : e) {
//			if (a1.getSalary() == max) {
//				max = a1.getSalary();
//				nam = a1.getName();
//				System.out.println(max);
//				System.out.println(nam);
//			} else
//				max = a1.getSalary();
//		}
//	}
//**********************************************
	// display only date of joining of employees
//	public void displayDate() {
//		for (MyDate d1 : m) {
//			System.out.println(d1);
//		}
//	}
//***************************************
	// check id of user by taking input from user id exist or not
	// Employee obj = null;

//	public void checkId() {
//
//		for (int i = 0; i < e.length; i++) {
//			if (ide == e[i].getId()) {
//				obj = e[i];
//				break;
//			}
//
//		}
//	}
//**************************************************
	// compare salary of employees and print employee whose salary is same with
	// details
//	public void compareSalary() {
//		if (obj != null) {
//			for (int i = 0; i < e.length; i++) {
//				if (obj.getSalary() == e[i].getSalary()) {
//					System.out.println(e[i]);
//				}
//			}
//		}
//		else
//		{
//			System.out.println("Employee Does Not Exist With this id"+ide);
//		}
//	}
//*****************************************************

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ea[] = new Employee[5];
		// MyDate obj1 = new MyDate();

		// Scanner sc = new Scanner(System.in);//

		// Print_Employees obj = new Print_Employees(ea);

//		System.out.println("Enter your Id");
//		obj.ide = sc.nextInt();

		ea[0] = new Employee(101, "Abhi", 123456.00, new MyDate(10, 10, 2023), new Department_Q3(1002, "Manager"));
		ea[1] = new Employee(102, "Abhishek", 12356.0, new MyDate(11, 10, 2023), new Department_Q3(1003, "Testing"));
		ea[2] = new Employee(103, "Abhilasha", 123456.0, new MyDate(12, 10, 2023), new Department_Q3(1002, "Manager"));
		ea[3] = new Employee(104, "Abhinav", 123456.0, new MyDate(10, 10, 2023), new Department_Q3(1005, "Finance"));
		ea[4] = new Employee(105, "Ashish", 123456.0, new MyDate(10, 10, 2023), new Department_Q3(1006, "Management"));

		Print_Employees obj = new Print_Employees(ea);
		//obj.displayEmployeeDepartmnet();

		// obj.printEmployee();
		// obj.displayEmployee();
		// obj.displayDate();
//		obj.checkId();
//		obj.compareSalary();

		// ********************************
		// compare date of joining of employees and print employee whose date of joining
		// is same...
//		for (int i = 0; i < ea.length; i++) {
//			for (int j = 0; j < ea.length; j++) {
//				if ((i != j) && (ea[i].doj.compareDate(ea[j].doj))) {
//					System.out.println(ea[i]);
//					break;
//				}
//			}
//		}
		//******************************************
		//print employees wo have same department
		for(int i=0;i<ea.length;i++)
		{
			for(int j=0;j<ea.length;j++)
			{
				if(i!=j&&ea[i].dpt.compareName(ea[j].dpt))
				{
					System.out.println(ea[i]);
					break;
				}
			}
		}

	}

}
