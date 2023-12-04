package com.test_01_12_23;

import java.util.ArrayList;
import java.util.Collections;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<>();
		al.add("Dhaani");
		al.add("Muskan");
		al.add("Sanskriti");
		al.add("Ekta");
		al.add("Ragini");

		Collections.sort(al);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);

	}

}
