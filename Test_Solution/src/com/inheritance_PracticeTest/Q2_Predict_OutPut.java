package com.inheritance_PracticeTest;

class Aa {
	static int i;
	static {
		System.out.println("1");
		i = 100;
	}
}

public class Q2_Predict_OutPut {
	static {
		System.out.println("2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("3");
		System.out.println(Aa.i);

	}

}
