package com.arraylist_assignments;

import java.util.ArrayList;
import java.util.Collections;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> strlist = new ArrayList<>();
		strlist.add("Monday");
		strlist.add("Tuesday");
		strlist.add("Wednesday");
		strlist.add("Thursday");
		strlist.add("Friday");
		strlist.add("Saturday");
		strlist.add("Sunday");
		Collections.sort(strlist);
		System.out.println(strlist);
		boolean t=strlist.contains("Monday");
		System.out.println(t);
		System.out.println("****************");
		ArrayList<String> strlist1 = new ArrayList<>();
		strlist1.add("Monday");
		strlist1.add("Tuesday");
		strlist1.add("Wednesday");
		System.out.println(strlist1);
 		//boolean t1=strlist.containsAll(strlist1);
		//System.out.println(t1);
		strlist.addAll(strlist1);
		System.out.println(strlist);
		boolean t2=strlist.containsAll(strlist1);
		System.out.println(t2);
		



	}

}
