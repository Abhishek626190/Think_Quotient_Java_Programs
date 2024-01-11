package com.aprilFinalWrittenTest2019;

/*
 * 12)An map contains student object as a key and list of courses he has enrolled in. [1M]
e.g. map<student , list(course)>
Create another map in which course id is a key and list of student objects of that 

 */
import java.util.Objects;

public class Student {

	private int sid;
	private String name;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int sid, String name) {
		// super();
		this.sid = sid;
		this.name = name;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(sid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return sid == other.sid;
	}

}
