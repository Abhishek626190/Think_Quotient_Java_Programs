package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l1 = new ArrayList();
		l1.add(12);
		l1.add(13);
		l1.add(14);
		l1.add(15);
		l1.add(16);
		Object arr[] = l1.toArray();
		System.out.println(Arrays.toString(arr) + "****");
		Integer arr1[] = l1.toArray(new Integer[l1.size()]);
		System.out.println(Arrays.toString(arr1) + "**");
		int sum = 0;
		for (int i = 0; i < l1.size(); i++) {
			System.out.print(l1.get(i) + ",");
			sum = sum + l1.get(i);
		}
		System.out.println(sum);
		System.out.println("\n*****************");
		sum = 0;
		for (int i : l1) {
			System.out.print(i + ",");
			sum = sum + i;
		}
		System.out.println(sum);
		System.out.println("***************");
		sum = 0;
		Iterator<Integer> itr = l1.iterator();
		while (itr.hasNext()) {
			// System.out.print(itr.next()+",");
			sum = sum + itr.next();

		}
		System.out.println(sum);

		List<Integer> l2 = Arrays.asList(5, 6, 7, 8, 9);
		List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6);
		ArrayList<Integer> l3 = new ArrayList<>(Arrays.asList(1, 2, 3));
		Iterator<Integer> itr1 = l3.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
			// l3.add(10);//Run time error
		}
		// System.out.println(l3 + "" + l + "" + l2);

	}

}
