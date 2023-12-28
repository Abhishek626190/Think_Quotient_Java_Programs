package com.innerClasses;

public class OuterDemo {
	
	int outer=100;
	int data=50;
	
	public OuterDemo(int outer) {
		//super();
		this.outer = outer;
	}

	public void show()
	{
		System.out.println("Outer Class Show Method");
		System.out.println(this.data);
		System.out.println();
		InnerDemo i=new InnerDemo(10);
		System.out.println(i.data);
 	}
	
	
	@Override
	public String toString() {
		return "Outer [outer=" + outer + "]";
	}


	public class InnerDemo
	{
		int inner =200;
		int data=80;
		public InnerDemo(int inner) {
			super();
			this.inner = inner;
		}

		public void display() {
			System.out.println("Inner class display method");
			System.out.println(OuterDemo.this.data);
		}

		@Override
		public String toString() {
			return "Inner [inner=" + inner + "]";
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterDemo objout=new OuterDemo(100);
		//System.out.println(objout);
		objout.show();
		OuterDemo.InnerDemo objin=objout.new InnerDemo(200);
		//System.out.println(objin);
		objin.display();
  		//System.out.println(objout.data);
  		//System.out.println(objin.data);

	}

}
