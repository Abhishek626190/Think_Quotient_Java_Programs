package com.stack;

import java.util.Iterator;
import java.util.Stack;

import com.queue.Student;

public class StudentStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Student> stdst = new Stack<>();

		Student obj1 = new Student(101, "Abhi");
		Student obj2 = new Student(103, "Akansha");
		Student obj3 = new Student(102, "Priya");
		Student obj4 = new Student(104, "Muskan");
		Student obj5 = new Student(101, "Abhi");

		stdst.push(obj1);
		stdst.push(obj2);
		stdst.push(obj3);
		stdst.push(obj4);
		stdst.push(obj5);

		Iterator<Student> stditr = stdst.iterator();
		while (stditr.hasNext()) {
			Student s = stditr.next();
			System.out.println(s);
		}
//		while(!stdst.empty())
//		{
//			//System.out.println(stdst.pop());
//			stdst.pop();
//		}
		// System.out.println(stdst);
		for (int i = 0; !stdst.empty() && i < stdst.size(); i++) {
			//System.out.println(stdst.size());
			stdst.pop();
			//System.out.println(stdst.size());
		}
		System.out.println(stdst);

	}

}
