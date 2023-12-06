package com.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PriorityQueue<Integer>q=new PriorityQueue<>();
		Queue<Integer>q=new PriorityQueue<>();
 		q.add(10);
		q.add(22);
		q.add(21);
		q.add(23);
		System.out.println(q.offer(10));
		//System.out.println(q);
		Iterator<Integer>itr=q.iterator();
		while(itr.hasNext())
		{
			//System.out.println(itr.next());
			int i=itr.next();
			System.out.print(i+",");
//			q.add(54);
//			System.out.println(q);
//			itr.remove();
//			System.out.println(q);
 		}
//		System.out.println(q.poll());
//		System.out.println(q);
//
//		System.out.println(q.remove());
//		System.out.println(q);


		

	}

}
