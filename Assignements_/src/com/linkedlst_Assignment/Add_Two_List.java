package com.linkedlst_Assignment;

import java.util.Collections;
import java.util.LinkedList;

public class Add_Two_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l = new LinkedList<>();
		l.add(18);
		l.add(11);
		l.add(12);
		l.add(13);
		l.add(14);
		l.add(10);
		System.out.println("Elements of first list\n" + l);
		LinkedList<Integer> l1 = new LinkedList<>();
		l1.add(28);
		l1.add(21);
		l1.add(22);
		l1.add(23);
		l1.add(24);
		l1.add(20);
		System.out.println("Elements of second list\n" + l1);
		System.out.println("Add Elements of first list in Second List");
		l.addAll(l1);
		System.out.println(l);

	}

}
