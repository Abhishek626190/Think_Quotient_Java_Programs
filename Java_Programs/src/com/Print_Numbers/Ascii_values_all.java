package com.Print_Numbers;

//12. Write a program to print the ASCII values

public class Ascii_values_all {
//	public void print() {
//		for (char ch = '!'; ch <= 'ÿ'; ch++) {
//			System.out.println((int)ch + "="+ch);
//		}
//	}
	public void prints() {
		for ( int i=0;i<=255;i++) {
			System.out.println((char)i + "="+i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ascii_values_all obj=new Ascii_values_all();
		//obj.print();
		obj.prints();
	}

}
