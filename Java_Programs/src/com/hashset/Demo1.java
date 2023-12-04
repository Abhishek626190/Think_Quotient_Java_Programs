package com.hashset;

import java.util.ArrayList;
import java.util.HashSet;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>al=new ArrayList<>();
		al.add("Blue");
		al.add("Green");
		al.add("Black");
		al.add("Pink");
		al.add("Yellow");
		al.add("Blue");
		System.out.println("ArrayList "+al);
		HashSet<String>hs=new HashSet<>();
		hs.add("Blue");
		hs.add("Green");
		hs.add("Black");
		hs.add("Pink");
		hs.add("Yellow");
		hs.add("Blue");
		System.out.println("HashSet "+hs);


	}

}
