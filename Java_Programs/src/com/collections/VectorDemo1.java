package com.collections;

import java.util.ArrayList;
import java.util.Vector;

public class VectorDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>al=new ArrayList<>();
		al.add("Anamika");
		al.add("Abhi");
		al.add("Suraj");
		al.add("Yogesh");
		al.add("Adarsh");
		al.add("Bhakti");
  		Vector<String>vl=new Vector<>(al);
		System.out.println(vl);
		System.out.println(vl.capacity());


	}

}
