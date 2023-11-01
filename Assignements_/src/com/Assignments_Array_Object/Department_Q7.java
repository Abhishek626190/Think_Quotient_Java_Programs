package com.Assignments_Array_Object;

public class Department_Q7 {

	private int did;
	private String dname;
	 
	Department_Q7() {
		 
	}

	Department_Q7(int id, String name) {
		this.did = id;
		this.dname = name;

	}

	public void setDid(int id) {
		this.did = id;
	}

	public int getDid() {
		return did;
	}

	public void setDname(String name) {
		this.dname = name;
	}

	public String getDname() {
		return dname;
	}
	public boolean compareName(Department_Q7  n) {

		if (this.dname == n.dname ) {
			return true;
		}
		return false;
	}

	public String toString() {
		return "Id:" + did + "\nName:" + dname;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department_Q7 obj = new Department_Q7(1001, "Developer");
		System.out.println(obj);
 

	}

}
