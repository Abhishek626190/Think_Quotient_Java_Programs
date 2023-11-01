package com.oops;

public class MethodOverRiding {

	public void add(int i, int j) {
//		int sum = i + j;
//		System.out.println(sum);
		System.out.println(i+j);
	}

	public void add(float k, float l) {
//		float sum = k + l;
//		System.out.println(sum);
		System.out.println(k+l);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverRiding obj = new MethodOverRiding();
		obj.add(10, 20);
		obj.add(10f, 20f);
		//obj.add(30, 40);//This is methodoverriding//

	}

}
