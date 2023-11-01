package com.Print_Numbers;

//6. Write a program to print reverse alphabets from Z to A

public class Alphabets_A_to_Z_print {
	public void print() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch + ",");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alphabets_A_to_Z_print obj = new Alphabets_A_to_Z_print();

		obj.print();

	}

}
