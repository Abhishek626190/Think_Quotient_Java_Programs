package com.linkedlst_Assignment;

import java.util.Collections;
import java.util.LinkedList;

public class Shuffle_Elements  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 		LinkedList<Integer> l = new LinkedList<>();
		l.add(18);
		l.add(11);
		l.add(12);
		l.add(13);
		l.add(14);
		l.add(10);
		System.out.println("Before Shuffling list");
		System.out.println(l);
		System.out.println("After Shuffling list");
		Collections.shuffle(l);
		System.out.println(l);

	}

}
