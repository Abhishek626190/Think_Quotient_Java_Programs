package com.test_02_12_23;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		LinkedList<Integer>list=new LinkedList<>();
//		list.add(2);
//		list.add(8);
//		list.add(5);
//		list.add(1);
//		Iterator<Integer>itr=list.iterator();
		
		LinkedList  list=new LinkedList<>();
		list.add(new Integer(2));
		list.add(new Integer(8));
		list.add(new Integer(5));
		list.add(new Integer(1));
		Iterator itr=list.iterator();
		Collections.reverse(list);
		Collections.shuffle(list);
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		//System.out.println(list);

		

	}

}
