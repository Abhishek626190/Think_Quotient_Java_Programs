package com.Print_Numbers;
//7. Write a program to print all even numbers between 1 to 100
public class Even_Numbers_1to100 {

	public void print() {

		for (int i = 1; i <= 100; i++) {
			if(i%2==0)
				System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Even_Numbers_1to100 obj=new Even_Numbers_1to100();
		obj.print();

	}

}
