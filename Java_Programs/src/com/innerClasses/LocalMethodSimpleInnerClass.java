package com.innerClasses;

public class LocalMethodSimpleInnerClass {

	public LocalMethodSimpleInnerClass() {
		// TODO Auto-generated constructor stub
		System.out.println("Outer Constructor");
 
	}
	public void check() {
		class Inner1 {
			int inner1 = 200;
			int data1 = 80;

			public Inner1(int inner1) {
				// super();
				this.inner1 = inner1;
				System.out.println("I am in innerconstructor");
			}

			public void display() {
				System.out.println("Inner1 class display method");
				// System.out.println(Outer.this.data);
				System.out.println(inner1);
				System.out.println(data1);
			}
			
 		}
		Inner1 in=new Inner1(10);
		in.display();
 	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalMethodSimpleInnerClass obj=new LocalMethodSimpleInnerClass();
		obj.check();
 
	}

}
