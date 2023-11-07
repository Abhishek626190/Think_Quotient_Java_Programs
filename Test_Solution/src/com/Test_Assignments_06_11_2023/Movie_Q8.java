package com.Test_Assignments_06_11_2023;

import java.util.Arrays;

public class Movie_Q8 {
	private int mid;
	private String mname;
	private float rating;
	public Movie_Q8() {
		// TODO Auto-generated constructor stub
		this.mid=0;
		this.mname="";
		this.rating=0;
		
	}
	Movie_Q8(int i,String n,float r)
	{
		this.mid=i;
		this.mname=n;
		this.rating=r;
	}
	public void setId(int i) {
		this.mid = i;
	}

	public int getId() {
		return mid;
	}

	public void setName(String n) {
		this.mname = n;
	}

	public String getName() {
		return mname;
	}
	public void setRating(float r)
	{
		this.rating=r;
	}
	public float getRating()
	{
		return rating;
	}

	public String toString() {
		return "\nMovie Id:" + mid + " Movie Name:" + mname +"Rating:"+rating;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie_Q8 obj=new Movie_Q8(101,"DDLJ",8.5f);
		System.out.println(obj);

	}

}
