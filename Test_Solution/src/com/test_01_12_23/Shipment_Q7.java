package com.test_01_12_23;

public class Shipment_Q7 implements Comparable<Shipment_Q7> {
	private int id;
	private String name;
	private Address_Q7 address;
	private MyDate_Q7 shipdate;
	
	public Shipment_Q7(int id, String name, Address_Q7 address, MyDate_Q7 shipdate) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.shipdate = shipdate;
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

	public Address_Q7 getAddress() {
		return address;
	}

	public void setAddress(Address_Q7 address) {
		this.address = address;
	}

	public MyDate_Q7 getShipdate() {
		return shipdate;
	}

	public void setShipdate(MyDate_Q7 shipdate) {
		this.shipdate = shipdate;
	}

	@Override
	public String toString() {
		return "\nShipment_Q7 [id=" + id + ", name=" + name + ", address=" + address + ", shipdate=" + shipdate + "]";
	}
	
	@Override
	public int compareTo(Shipment_Q7 o) {
		// TODO Auto-generated method stub
		return this.address.getCity().compareTo(o.address.getCity());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

}
