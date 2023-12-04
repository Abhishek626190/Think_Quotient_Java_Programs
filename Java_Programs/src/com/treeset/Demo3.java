package com.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo3 {
	public int compare(TreeSet<String> d1, TreeSet<String> d2) {
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo3 obj = new Demo3();
		TreeSet<String> ts = new TreeSet<>();
		ts.add("Abhi");
		ts.add("Aadarsh");
		ts.add("Vivek");
		ts.add("Suraj");
		System.out.println(ts);
		TreeSet<String> ts1 = new TreeSet<>();
		ts1.add("Muskan");
		ts1.add("Rupali");
		ts1.add("Pratiksha");
		ts1.add("Priya");
		System.out.println(ts1);
		obj.compare(ts, ts1);

	}

}
