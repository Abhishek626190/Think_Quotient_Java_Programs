package com.Operator_Practice_Test;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sale=22000;
		double incentive=(sale>=50000)?sale*0.10:(sale>=30000)?sale*0.08:(sale>=10000)?sale*0.05:0;
		System.out.println("Incentive Earned Is = "+incentive);

	}

}
