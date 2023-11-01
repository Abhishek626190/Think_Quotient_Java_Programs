package com.Inheritance_Demo;

class Electronic_Device {
	Electronic_Device() {
		System.out.println("Electronic Device Default Constructor");
	}
}

class Computer extends Electronic_Device {
	Computer() {
		System.out.println("Computer Default Constructor");

	}
}

class TV extends Electronic_Device {
	TV() {
		System.out.println("TV Default Constructor");

	}
}

class MObilePhone extends Electronic_Device {
	MObilePhone() {
		System.out.println("Mobile Phone Default Constructor");

	}
}

class LCD_TV extends TV {
	LCD_TV() {
		System.out.println("LCD_TV Default Constructor");

	}
}

class LED_TV extends TV {
	LED_TV() {
		System.out.println("LED_TV Default Constructor");

	}
}

public class Electronic_Device_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV t=new TV();
		System.out.println(t);
	}

}
