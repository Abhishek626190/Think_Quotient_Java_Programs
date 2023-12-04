package com.test_01_12_23;

public class Address_Q7 {
	private String addr,city,state;
	
	public Address_Q7(String addr, String city, String state) {
		super();
		this.addr = addr;
		this.city = city;
		this.state = state;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address_Q7 [addr=" + addr + ", city=" + city + ", state=" + state + "]";
	}

 
	public int compareTo(Address_Q7 a2) {
		// TODO Auto-generated method stub
		return this.getAddr().compareTo(a2.getAddr());
	}

}
