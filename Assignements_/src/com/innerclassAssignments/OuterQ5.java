package com.innerclassAssignments;

public class OuterQ5 {
	public OuterQ5() {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor of Outer class");
	}
	
	public void outerMethod()
	{
		class Inner11{
			public Inner11() {
				// TODO Auto-generated constructor stub
				System.out.println("Constructor of inner class");
			}
			public void sky()
			{
				System.out.println("Sky is in blue color");
			}
		}
		Inner11 in=new Inner11();
		in.sky();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OuterQ5 o=new OuterQ5();
		o.outerMethod();
		
 
	}

}
