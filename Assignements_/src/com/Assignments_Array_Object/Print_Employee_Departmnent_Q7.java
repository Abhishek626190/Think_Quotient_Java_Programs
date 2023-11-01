package com.Assignments_Array_Object;

public class Print_Employee_Departmnent_Q7 {
	Employee_Q_7 emp[];
	Print_Employee_Departmnent_Q7()
	{
		
	}
	Print_Employee_Departmnent_Q7(Employee_Q_7 e[])
	{
		this.emp=e;
	}
	public void display()
	{
		 for(Employee_Q_7 i:emp)
		 {
			 System.out.println(i);
		 }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee_Q_7 earr[]=new Employee_Q_7[3];
		earr[0]=new Employee_Q_7(101,"Abhi",new Department_Q7(201,"Manager"));
		earr[1]=new Employee_Q_7(102,"Abhishek",new Department_Q7(202,"Developer"));
		earr[2]=new Employee_Q_7(103,"Abhijeet",new Department_Q7(203,"Finance"));
		
		Print_Employee_Departmnent_Q7 obj=new Print_Employee_Departmnent_Q7(earr);
		obj.display();
	}

}
