package com.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Student_PQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj1=new Student(101,"Abhi");
		Student obj2=new Student(102,"Akansha");
		Student obj3=new Student(103,"Priya");
		Student obj4=new Student(104,"Muskan");
		Student obj5=new Student(101,"Abhi");
		
		Queue<Student>stdq=new PriorityQueue<>();
		stdq.add(obj1);
		stdq.add(obj2);
		stdq.add(obj3);
		stdq.add(obj4);
		stdq.add(obj5);
		stdq.add(obj1);
		//System.out.println(stdq.poll());
		//System.out.println(stdq);
		
		Iterator<Student>stditr=stdq.iterator();
		while(stditr.hasNext())
 		{
			Student s=stditr.next();
 			 
  		}
		 
		System.out.println(stdq);
 
	}

}
