package com.ContainmentAssignements;

public class Department {
	private int id;
	private String name;
	Student student;
	Student stu[];

	Department() {

	}

	Department(String na, int i, Student s,Student st[]) {
		this.name = na;
		this.id = i;
		this.student = s;
		this.stu=st;
	}

	public void setId(int i) {
		this.id = i;
	}

	public int getId() {
		return id;
	}

	public void setName(String na) {
		this.name = na;
	}

	public int getNmae() {
		return id;
	}

	public void setStudent(Student s) {
		this.student = s;
	}

	public Student getStudent() {
		return student;
	}

	public String toString() {
		return "Name:" + name + "\nDepartment_Id:" + id + "\n"+student;
	}
	public void printStudent()
	{
		for(Student a:stu)
		{
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Department obj = new Department();
		Student obj1 = new Student("Abhi", 101);
		Student stu[]=new Student[3];
		stu[0]=new Student("Abhishek",102);
		stu[1]=new Student("Abhishek",103);
 		stu[2]=new Student("Abhishek",104);

		Department obj2 = new Department("MCA", 201, obj1,stu);
  		System.out.println(obj2);
  		obj2.printStudent();

	}

}
