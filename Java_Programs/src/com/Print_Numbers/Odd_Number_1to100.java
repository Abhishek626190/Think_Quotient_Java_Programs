package com.Print_Numbers;
//8. Write a program to print all odd number between 1 to 100
public class Odd_Number_1to100 {
	public void print() {

		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0)
				System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Odd_Number_1to100 obj = new Odd_Number_1to100();
		obj.print();

	}

}