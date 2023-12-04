package com.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> str = new LinkedList<>();
		str.add("Abhi");
		str.add("Suraj");
		str.add("Yogesh");
		str.add("Adarsh");
		str.add("Bhakti");
		str.add("Maruti");
		str.add("Ganesh");
		str.add("Sudarshan");
		str.add("Utkarshsa");
		str.add("Ishwar");
		str.add("Sunish");
		str.addFirst("Dhaani");
		str.addLast("Muskan");
		str.set(5, "Priya");
//		str.removeFirst();
//		str.removeLast();
//		str.remove(4);
//		System.out.println(str.getFirst());
//		System.out.println(str.getLast());
//		System.out.println(str.get(5));
//		System.out.println(str.offerFirst("Dhaani"));
//		System.out.println(str.offerLast("Dhani"));
//		System.out.println(str.peekFirst());
//	    System.out.println(str.peekLast());
//		System.out.println(str.pop());

		Iterator<String> itr = str.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
