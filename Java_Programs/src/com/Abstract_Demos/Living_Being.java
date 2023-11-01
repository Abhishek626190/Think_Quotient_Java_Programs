package com.Abstract_Demos;

public class Living_Being {
	Living_Being() {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Tiger();
		Animal a1 = new Elephant();
		a.eat();
		a1.eat();
	}
}

abstract class Animal {

	abstract void eat();
}

class Tiger extends Animal {
	void eat() {
		System.out.println("Tiger love to eat meat:😉😉❤️");
	}
}

class Elephant extends Animal {
	void eat() {
		System.out.println("Elephant love to eat SugarCane:😉😉❤️");
	}
}
