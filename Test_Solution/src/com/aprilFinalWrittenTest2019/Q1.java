package com.aprilFinalWrittenTest2019;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 34;
        int b = 21;
        int c = a++ + ++b;
        int d = --a + --b + c--;
        int e = a + +b + +c + d--;
        int f = -a + b-- + -c - d++;
        int sum = a + b + c + d + e + f;
        System.out.println("sum = " + sum);


	}

}
