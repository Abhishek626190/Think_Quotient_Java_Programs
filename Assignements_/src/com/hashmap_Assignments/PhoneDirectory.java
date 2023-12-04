package com.hashmap_Assignments;

import java.util.ArrayList;
import java.util.Objects;

public class PhoneDirectory {
	 
	private ArrayList<Long>phone;
	public PhoneDirectory() {
		// TODO Auto-generated constructor stub
	}
	PhoneDirectory(ArrayList<Long>phone)
	{
		 
		this.phone=phone;
	}

//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
	public ArrayList<Long> getPhone() {
		return phone;
	}
	public void setPhone(ArrayList<Long> phone) {
		this.phone = phone;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash( phone);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhoneDirectory other = (PhoneDirectory) obj;
		return  Objects.equals(phone, other.phone);
	}
	
	@Override
	public String toString() {
		return "PhoneDirectory [ phone=" + phone + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
