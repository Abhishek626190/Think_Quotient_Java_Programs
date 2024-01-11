package com.aprilFinalWrittenTest2019;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class StudnetMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(101, "Abhi");
		Student s2 = new Student(102, "Adi");
		Student s3 = new Student(103, "Suraj");
		Student s4 = new Student(104, "Yogesh");
		Student s5 = new Student(105, "Prateeksha");
		Student s6 = new Student(106, "Rupali");

		Course c1 = new Course(201, "MCA");
		Course c2 = new Course(202, "MBA");
		Course c3 = new Course(203, "MA");
		Course c4 = new Course(204, "ME");
		Course c5 = new Course(205, "BTECH");

		List<Course> course1 = new ArrayList<>();
		course1.add(c1);
		course1.add(c2);
		List<Course> course2 = new ArrayList<>();
		course2.add(c3);
		course2.add(c4);
		List<Course> course3 = new ArrayList<>();
		course3.add(c5);
		course3.add(c1);

		HashMap<Student, List<Course>> map = new HashMap<>();
		map.put(s1, course1);
		map.put(s2, course2);
		map.put(s3, course3);
		// System.out.println(map);
		HashMap<Integer, List<Student>> map1 = new HashMap<>();
		Set<Entry<Student, List<Course>>> set = map.entrySet();
		Iterator<Entry<Student, List<Course>>> itr = set.iterator();
		while (itr.hasNext()) {
			Entry<Student, List<Course>> e = itr.next();
			List<Course> l = e.getValue();
			for (int i = 0; i < l.size(); i++) {
				Integer cid = l.get(i).getCid();
				for (int j = 0; j < map.size(); j++) {

				}
			}
		}
	}

}
