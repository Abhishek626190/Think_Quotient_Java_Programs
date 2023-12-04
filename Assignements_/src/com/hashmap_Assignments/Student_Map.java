package com.hashmap_Assignments;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class Student_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(101, "Abhishek");
		Student s2 = new Student(102, "Abhi");
		Student s3 = new Student(103, "Abhijeet");
		Student s4 = new Student(104, "Abhinav");
		Student s5 = new Student(105, "Abhilash");
		Student s6 = new Student(101, "Abhishek");

		HashMap<Student, String> stdmap = new HashMap<>();
		stdmap.put(s1, "Java");
		stdmap.put(s2, "Python");
		stdmap.put(s3, "C");
		stdmap.put(s4, "C++");
		stdmap.put(s4, "Java");
		stdmap.put(s6, ".Net");
		// System.out.println(stdmap);
		Set<Entry<Student, String>> s = stdmap.entrySet();
		for (Entry<Student, String> ob : s) {
			System.out.println(ob.getKey() + "=" + ob.getValue());
		}

	}

}
