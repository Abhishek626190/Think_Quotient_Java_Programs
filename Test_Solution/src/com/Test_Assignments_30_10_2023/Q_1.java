package com.Test_Assignments_30_10_2023;

class A
{
	static int i;
	static
	{
		System.out.println(1);
		i=100;
	}
}
public class Q_1 {

	static {
		System.out.println(2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(3);
		System.out.println(A.i);
	}

}
