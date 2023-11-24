package com.collections;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIterator_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1 = (Arrays.asList(1, 2, 3, 4, 5));
		ListIterator<Integer> itr = l1.listIterator(l1.size());
//		while (itr.hasNext()) {
//			System.out.print(itr.next() + ",");
//		}
		System.out.println("**************");
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}

	}

}
