package com.inheritance_PracticeTest;

public class Q4_Predict_OutPut {
	Q4_Predict_OutPut() {
		this(5);
		System.out.println("I am in default constructor");
	}

	Q4_Predict_OutPut(int x) {
		this(5, 15);
		System.out.println(x);
	}

	Q4_Predict_OutPut(int x, int y) {
		System.out.println(x * y);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Q4_Predict_OutPut();

	}

}
