package com.treesetAssignments;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.Scanner;

public class Uniques_Name_Tracker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		TreeSet<String> ts = new TreeSet<>();
		ts.add("Akansha");
		ts.add("Aastha");
		ts.add("Chavvi");
		ts.add("Sanu");
		ts.add("Aarohi");
		ts.add("Laxmi");
		ts.add("Aishwarya");
		ts.add("Hassena");
		ts.add("Rupali");
		// ts.add("Akansha");
		System.out.println("Your Unique Tracker Is:😍😍😍 ");
		Iterator<String> itr = ts.iterator();
		while (itr.hasNext()) {
			String s = itr.next();
			System.out.println(s);
		}

		System.out.println("To Add Name Press '+' ");
		System.out.println("To Remove Name Press '-' ");
		System.out.println("To Check Name Exists Or Not Press '*' ");
		char choice = sc.next().charAt(0);
		switch (choice) {
		case '+':
			while (true) {
				System.out.println("Enter Name To Add");
				String name = sc.next();
				if (ts.contains(name)) {
					System.out.println("Name Already Exists 😡😡😡😡");
					System.out.println("Please Add Another Name");
					continue;
				} else {
					ts.add(name);
					System.out.println("Name Added Successfully😍😍😍");
				}
				System.out.println("For Adding Another Name Press 'y' or  For Exit Press Any Key:");
				char ch = sc.next().charAt(0);
				if (Character.toUpperCase(ch) == 'Y') {
					continue;
				} else {
					System.out.println("Your Tracker After Adding Name:");
					System.out.println(ts);
					System.out.println("Thank You See You Again👍👍👍");
					break;
				}

			}
			break;

		case '-':
			while (true) {
				System.out.println("Enter Name To Remove");
				String name = sc.next();
				if (!ts.contains(name)) {
					System.out.println("Name Not Exists Please Enter Existing Name To Remove");
					System.out.println("Try Again");
					continue;
				} else {
					ts.remove(name);
					System.out.println("Name Removed Successfully 😍😍😍");

				}
				System.out.println("For Removing Another Name Press 'y' or  For Exit Press Any Key:");
				char ch = sc.next().charAt(0);
				if (Character.toUpperCase(ch) == 'Y') {
					continue;
				} else {
					System.out.println("Your Tracker After Removing Name:");
					System.out.println(ts);
					System.out.println("Thank You See You Again👍👍👍");
					break;
				}
			}
			break;
		case '*':
			while (true) {
				System.out.println("Enter Name TO Check");
				String name = sc.next();
				if (ts.contains(name)) {
					System.out.println(name + " Name Exists ");
				} else {
					System.out.println(name + " Name Not Exists");
				}
				System.out.println("To check Another name enter 'y' or For exit press any key");
				char ch = sc.next().charAt(0);
				if (Character.toUpperCase(ch) == 'Y') {
					continue;
				} else {
					System.out.println("Checked Successfully...");
					System.out.println(ts);
					System.out.println("Thank You See You Again👍👍👍");
					break;
				}

			}
		default:
			System.out.println("Invalid Input:");
		}

	}

}
