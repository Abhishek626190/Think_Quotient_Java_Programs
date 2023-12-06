package com.collection_Master_Assignment.Master_Assignment;

import java.util.ArrayList;
import java.util.Objects;

public class Course {
	private int cid, duration;
	private String cname;
	private Date startDate;
	private double fees;
	private ArrayList<String> subject;

	public Course(int cid, int duration, String cname, Date startDate, double fees, ArrayList<String> subject) {
		super();
		this.cid = cid;
		this.duration = duration;
		this.cname = cname;
		this.startDate = startDate;
		this.fees = fees;
		this.subject = subject;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public ArrayList<String> getSubject() {
		return subject;
	}

	public void setSubject(ArrayList<String> subject) {
		this.subject = subject;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cid, cname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return cid == other.cid && Objects.equals(cname, other.cname);
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", duration=" + duration + ", cname=" + cname + ", startDate=" + startDate
				+ ", fees=" + fees + ", subject=" + subject + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
