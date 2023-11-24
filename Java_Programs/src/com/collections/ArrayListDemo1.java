package com.collections;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> l1 = new ArrayList<>();
		l1.add("Abhi");
		l1.add("Abhishek");
		l1.add("Ajay");
		l1.add("Amit");
		System.out.println(l1);
		l1.remove(0);
		System.out.println(l1);
		l1.remove(2);
		System.out.println(l1);
		l1.add(0, "Ankit");
		System.out.println(l1);
		System.out.println(l1.size());
		ArrayList<String> l2 = new ArrayList<>();
		l2.add("Adarsh");
		l2.add("Suraj");
		l1.addAll(l2);
		System.out.println(l2);
		l1.addAll(1, l2);
		System.out.println(l1);
		System.out.println(l1.size());
		System.out.println(l2.size());

	}

}
