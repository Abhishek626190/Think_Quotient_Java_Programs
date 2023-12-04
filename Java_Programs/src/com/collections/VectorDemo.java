package com.collections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> str = new Vector<>(10);
		System.out.println(str.capacity());
		str.add("Abhi");
		str.add("Suraj");
		str.add("Yogesh");
		str.add("Adarsh");
		str.add("Bhakti");
		str.add("Maruti");
		str.add("Ganesh");
		str.add("Sudarshan");
		str.add("Uttkarshs");
		str.add("Ishwar");
		str.add("Sunish");
		Enumeration<String> en = str.elements();
		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());

		}
		// System.out.println(str);
		System.out.println(str.capacity());

	}

}
