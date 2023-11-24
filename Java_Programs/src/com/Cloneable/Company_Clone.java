package com.Cloneable;

public class Company_Clone {
	private String name;
	private String address;
	Employee e;

	public Company_Clone(String name, String address, Employee e) {
		super();
		this.name = name;
		this.address = address;
		this.e = e;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee(101, "Abhi", 15000);
		Company_Clone obj = new Company_Clone("Infosys", "Pune", e);

		Employee e1 = null;
		try {
			e1 = (Employee) e.clone();
		} catch (CloneNotSupportedException i) {
			i.printStackTrace();
		}
		System.out.println(e);
		System.out.println(e1);

	}

}

class Employee implements Cloneable {
	private int id;
	private String name;
	private double salary;

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

//	@Override
//	protected Object clone()  {
//		try {
//			return super.clone();
//		} catch (CloneNotSupportedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		 
//		 
//	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();

	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
