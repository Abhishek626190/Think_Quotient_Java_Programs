package com.Array_Programs;

public class Var_Args_Demo {
	public int varArgs(int... n) {
		int sum = 0;
		for (int i = 0; i <= n.length - 1; i++) {
			sum = sum + n[i];
		}
		return sum;
	}

	public int sum(int i, int j) {
		int sum = 0;
		sum = i + j;
		return sum;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Var_Args_Demo obj = new Var_Args_Demo();
		System.out.println(obj.varArgs(10, 20, 30, 40, 50));
		System.out.println(obj.sum(10, 20));

	}

}
