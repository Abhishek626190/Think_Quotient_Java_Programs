package com.linkedlst_Assignment;

import java.util.LinkedList;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l = new LinkedList<>();
		l.add(10);
		l.add(11);
		l.add(12);
		l.add(13);
		l.add(14);
		l.add(10);
		System.out.println(l);
		System.out.println(l.indexOf(10));

		System.out.println(l.lastIndexOf(10));
		System.out.println("occurence by logic");
		int focc = 0;
		int lastocc = 0;
		int count = 0;

		for (int i = 0; i < l.size(); i++) {

			if (10 == l.get(i)) {
				count++;

				if (count == 1) {
					focc = i;
				} else
					lastocc = i;
			}
		}
		System.out.println(focc);
		System.out.println(lastocc);

	}

}
