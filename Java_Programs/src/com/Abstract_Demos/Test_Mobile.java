package com.Abstract_Demos;

public class Test_Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobilePhone m = new SimplePhone();
		MobilePhone m1 = new SmartPhone();
		m.makeCall();
		m1.makeCall();

	}

}

abstract class MobilePhone {
	abstract void makeCall();
}

class SimplePhone extends MobilePhone {
	void makeCall() {
		System.out.println("Method of SimplePhone class makeCall ");
		System.out.println("Audio Callig Available");
	}
}

class SmartPhone extends MobilePhone {
	void makeCall() {
		System.out.println("Method of SmartPhone class makeCall ");

		System.out.println("Video Calling");
	}
}
