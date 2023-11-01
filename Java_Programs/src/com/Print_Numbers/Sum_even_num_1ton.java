package com.Print_Numbers;
//10. Write a program to find sum of all even numbers between 1 to n
import java.util.Scanner;

public class Sum_even_num_1ton {
	static int sum = 0, num;

	public void print() {

		for (int i = 1; i <=num; i++) {
			if (i % 2 == 0) {
				//System.out.println(i);
				sum = sum + i;
			}
		}
	}

	public void displays() 
	{
		System.out.println("The Sum of Even Number from 1 to " + num + " is= " + sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum_even_num_1ton obj = new Sum_even_num_1ton();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter terms to print sum of even numbers");
		num=sc.nextInt();
		obj.print();
		obj.displays();

	}

}