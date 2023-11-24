package com.collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class StudentArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> s = new ArrayList<>();
		ArrayList<Integer> s1 = new ArrayList<>(Arrays.asList(90, 90, 90, 95, 90));
		ArrayList<Integer> s2 = new ArrayList<>(Arrays.asList(80, 50, 60, 70, 60));
		ArrayList<Integer> s3 = new ArrayList<>(Arrays.asList(89, 50, 70, 80, 60));
		ArrayList<Integer> s4 = new ArrayList<>(Arrays.asList(90, 75, 70, 50, 60));
		ArrayList<Integer> s5 = new ArrayList<>(Arrays.asList(40, 50, 30, 49, 29));

		s.add(new Student("Abhi", 101, s1));
		s.add(new Student("Vivek", 107, s2));
		s.add(new Student("Nitin", 103, s3));
		s.add(new Student("Shivraj", 109, s4));
		s.add(new Student("Pradeep", 105, s5));

		Collections.sort(s);
		// Collections.reverse(s);

		System.out.println(s + "\n");
//		ArrayList<Integer>marks;
//		Iterator<Student> itr = s.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		Iterator<Student> itr1 = s.iterator();
//		while (itr1.hasNext()) {
//			// System.out.println(itr1.next());
//			Student m1 = itr1.next();
//			if (m1.getName().length() > 5) {
//				System.out.println(s1);
//			}
//		}
		Iterator<Student> itr1 = s.iterator();
		int count = 0;
		while (itr1.hasNext()) {
			if (itr1.next().percentage >= 90)
				count++;
		}
		System.out.println(count);
	}

}
