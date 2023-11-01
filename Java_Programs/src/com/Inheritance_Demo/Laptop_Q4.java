package com.Inheritance_Demo;

public class Laptop_Q4 {
	private int noofusbport;
	private int processorspeed;

	Laptop_Q4() {

	}

	Laptop_Q4(int usb, int pro) {
		this.noofusbport = usb;
		this.processorspeed = pro;
	}

	public void setUsb(int u) {
		this.noofusbport = u;
	}

	public int getUsb() {
		return noofusbport;
	}

	public void setProc(int p) {
		this.processorspeed = p;
	}

	public int getPro() {
		return processorspeed;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop_Q4 obj = new Laptop_Q4();
		obj.setProc(8);
		System.out.println("Number Of Processor:" + obj.getPro());
		obj.setUsb(4);
		System.out.println("Number Of USB Port:" + obj.getUsb());

	}

}
