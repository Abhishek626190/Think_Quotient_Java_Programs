package com.test_08_12_23_Friday_OL;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Q8_StdHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q8_Student obj1 = new Q8_Student(101, 2023, "Abhi", "MCA", true);
		Q8_Student obj2 = new Q8_Student(102, 2023, "Suraj", "BE", true);
		Q8_Student obj3 = new Q8_Student(103, 2023, "Sunish", "MBA", false);
		Q8_Student obj4 = new Q8_Student(104, 2023, "Nisha", "MA", true);
		Q8_Student obj5 = new Q8_Student(105, 2023, "Abhishek", "Btech", false);

		List<Q8_Student> placedStd = new ArrayList<>();
		List<Q8_Student> unplacedStd = new ArrayList<>();

		HashSet<Q8_Student> stdset = new HashSet<>();
		stdset.add(obj1);
		stdset.add(obj2);
		stdset.add(obj3);
		stdset.add(obj4);
		stdset.add(obj5);

		Iterator<Q8_Student> stditr = stdset.iterator();
		while (stditr.hasNext()) {
			Q8_Student s = stditr.next();
			if (s.isPlaced() == true) {
				placedStd.add(s);
			} else
				unplacedStd.add(s);
		}
		stdset.clear();
		//System.out.println(stdset);
		System.out.println("List of Placed Students ");
		System.out.println(placedStd);
		System.out.println("\n******************");
		System.out.println("List of Un-Placed Students ");
 		System.out.println(unplacedStd);

	}

}
