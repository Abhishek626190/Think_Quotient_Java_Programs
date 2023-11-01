package com.Assignments_Array_Object;

public class Employee_Array_Q_6 {
	Employee_Q_6 e[];

	Employee_Array_Q_6() {

	}

	Employee_Array_Q_6(Employee_Q_6 em[]) {
		this.e = em;
	}
	public void printEmployees()
	{
		for(Employee_Q_6 i:e)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee_Q_6 emp[] = new Employee_Q_6[5];

		emp[0] = new Employee_Q_6(1002, "Abhi");
		emp[1] = new Employee_Q_6(102, "Abhishek");
		emp[2] = new Employee_Q_6(103, "Abhilasha");
		emp[3] = new Employee_Q_6(104, "Abhinav");
		emp[4] = new Employee_Q_6(105, "Ashish");
		Employee_Array_Q_6 obj=new Employee_Array_Q_6(emp);
		obj.printEmployees();

	}

}
