package com.collection_Master_Assignment.Master_Assignment;

import java.util.Objects;

public class Student {
	private int sid,cid;
	private String sname,email;
	private long phno;
	
 	public Student(int sid, int cid, String sname, String email, long phno) {
		super();
		this.sid = sid;
		this.cid = cid;
		this.sname = sname;
		this.email = email;
		this.phno = phno;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cid, email, phno, sid, sname);
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

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", cid=" + cid + ", sname=" + sname + ", email=" + email + ", phno=" + phno
				+ "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
