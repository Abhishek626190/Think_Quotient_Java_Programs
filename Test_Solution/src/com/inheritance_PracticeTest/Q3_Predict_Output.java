package com.inheritance_PracticeTest;

public class Q3_Predict_Output {
	static int x = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q3_Predict_Output a = new Q3_Predict_Output();
		Q3_Predict_Output b = new Q3_Predict_Output();
		Q3_Predict_Output.x = 20;
		b.x = 21;
		System.out.println(a.x);
		System.out.println(b.x);

	}

}
