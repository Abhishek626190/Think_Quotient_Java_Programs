package com.Assignments_Array_Object;

public class Student_Q5_PrintArray {
	Student_Q5 s[];

	Student_Q5_PrintArray() {

	}

	Student_Q5_PrintArray(Student_Q5 s[]) {
		this.s = s;
	}
	public void compareStudent()
	{
		for(int i=0;i<s.length;i++)
		{
			 if(s[i].age<15&&s[i].marks>60)
			 {
				System.out.println(s[i]); 
			 }
		}
	}

	public void displayStudent() {
		for (Student_Q5 i : s) {
			System.out.println(i);
		}

	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_Q5 sa[] = new Student_Q5[5];
		sa[0] = new Student_Q5(101, "Abhi", 23, 45);
		sa[1] = new Student_Q5(102, "Abhishek", 22, 45);
		sa[2] = new Student_Q5(103, "Abhinav", 14, 65);
		sa[3] = new Student_Q5(104, "Abhilasha", 12, 70);
		sa[4] = new Student_Q5(105, "Abhijeet", 25, 50);
		Student_Q5_PrintArray obj = new Student_Q5_PrintArray(sa);
		//obj.displayStudent();
		obj.compareStudent();
		 

	}

}
