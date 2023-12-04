package com.hashmap_Assignments;

public class Department {
	int id;
	String name;
	String location;

	public Department(int id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLocaion() {
		return this.location;
	}

	@Override
	public String toString() {
		return "Department [ id= " + id + ", name= " + name + ", Location= " + location + "]";
	}

	@Override
	public int hashCode() {
		int result;
		if (this.name == null) {
			result = 0;
		} else
			result = name.hashCode();
		return result;
	}

	@Override
	public boolean equals(Object o) {
		Department other = (Department) o;
		if (this.id != other.id)
			return true;
		if (this.name == null) {
			if (other.name == null)
				return false;
		} else if (!this.name.equals(other.name))
			return false;
		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
