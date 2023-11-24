package com.collection_assignments;

import java.util.ArrayList;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l1 = new ArrayList<>();
		int count = 0;
		for (int i = 1; count < 50; i = i + 2) {
			l1.add(i);
			count++;

		}
		System.out.println(l1);
		System.out.println(count);

	}

}
