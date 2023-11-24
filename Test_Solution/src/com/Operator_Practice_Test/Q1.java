package com.Operator_Practice_Test;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1, j;
		while (i <= 3) {
			i += 2;
			j = 1;
			System.out.println("i =" + i);
			while (j <= 5) {
				j++;
				if (j == 2)
					continue;
				if (j == 5) {
					break;
				}
				System.out.println("\t j=" + j);
			}
		}
	}

}
