package com.inheritance_PracticeTest;

public class Member {
	private String name, address;
	private int age;
	private double salary;
	private long phonenumber;

	public Member() {

	}

	public Member(String name, String address, int age, double salary, long phonenumber) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
		this.salary = salary;
		this.phonenumber = phonenumber;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}

	public void printSalary() {
		System.out.println("The salary Of:" + this.name + " is:" + this.salary);
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", address=" + address + ", age=" + age + ", salary=" + salary
				+ ", phonenumber=" + phonenumber + "]";
	}

	public static void main(String[] args) {

		Member obj = new Member("Abhishek", "Pune", 21, 15000.0, 6261904221l);
		System.out.println(obj);
		obj.printSalary();
		Manager m = new Manager("Abhishek", "Pune", 21, 15000.0, 6261904221l, "Testing");
		Employee e = new Employee("Abhi", "Pune", 21, 25000.0, 6261904221l, "Developer");
		System.out.println(m);
		System.out.println(e);

	}

}

class Manager extends Member {
	private String department;

	Manager() {
		super();
	}

	public Manager(String name, String address, int age, double salary, long phonenumber, String department) {
		super(name, address, age, salary, phonenumber);
		this.department = department;
	}

	public String toString() {
		return super.toString() + "Department:" + department;
	}

}

class Employee extends Member {
	private String specialization;

	Employee() {
		super();
	}

	public Employee(String name, String address, int age, double salary, long phonenumber, String specialization) {
		super(name, address, age, salary, phonenumber);
		this.specialization = specialization;

	}

	public String toString() {
		return super.toString() + "Speacialization:" + specialization;
	}

}
