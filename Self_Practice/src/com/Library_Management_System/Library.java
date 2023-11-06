package com.Library_Management_System;

import java.util.Scanner;
import java.util.Arrays;

public class Library {
	Book arr[];
	Scanner sc = new Scanner(System.in);

	Library() {
		this.arr = null;
	}

	Library(Book a[]) {
		this.arr = a;
	}

	public String toString() {
		return Arrays.toString(arr);

	}

	public void displayBook() {

		System.out.println("The Books Available in  Library are:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Book Title:" + arr[i].getTitle());
		}
		System.out.println("To know the complete detail of Book ,Please Enter Book Title ");
		String s = sc.nextLine();

		switch (s) {
		case "Love":
			System.out.println(arr[0]);
			break;
		case "Hate":
			System.out.println(arr[1]);
			break;
		case "Fear":
			System.out.println(arr[2]);
			break;
		case "Be Consitent":
			System.out.println(arr[3]);
			break;
		default:
			System.out.println("Please Enter valid Book Name");

		}
	}

	public void updateBook() {
		System.out.println("To Update Book Details Press 1");
		int upd = sc.nextInt();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book array[] = new Book[4];
		array[0] = new Book(786, "Arjit", "Love", 10, 2019, 5);
		array[1] = new Book(380, "Ravindra", "Hate", 15, 2015, 8);
		array[2] = new Book(144, "Abdul", "Fear", 20, 2011, 11);
		array[3] = new Book(101, "Abhishek", "Be Consitent", 21, 2001, 1);

		Library obj = new Library(array);
		// System.out.println(obj);
		// array[0].setAuthor("Atif");//Update Author;
		obj.displayBook();

	}

}
