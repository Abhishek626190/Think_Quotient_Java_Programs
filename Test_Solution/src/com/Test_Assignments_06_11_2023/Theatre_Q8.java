package com.Test_Assignments_06_11_2023;

import java.util.Arrays;

public class Theatre_Q8 {
	private int tid;
	private String tname;
	Movie_Q8 m;

	public Theatre_Q8() {
		// TODO Auto-generated constructor stub
		this.tid = 0;
		this.tname = "";
		this.m = null;

	}

	Theatre_Q8(int i, String n, Movie_Q8 r) {
		this.tid = i;
		this.tname = n;
		this.m = r;
	}

	public void setId(int i) {
		this.tid = i;
	}

	public int getId() {
		return tid;
	}

	public void setName(String n) {
		this.tname = n;
	}

	public String getName() {
		return tname;
	}

	public void printRating(Theatre_Q8 a[]) {
		Theatre_Q8 tarr[] = new Theatre_Q8[a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i != j) {
					if (a[i].m.getRating() > a[j].m.getRating()) {
						tarr[i] = a[j];
					} else {
						tarr[i] = a[i];
					}
				}
			}
		}
		System.out.println("\n***********");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public String toString() {
		return "\nTheatre Id:" + tid + " Theatre Name:" + tname + m;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie_Q8 obj1 = new Movie_Q8(101, "M.S.D", 8.8f);
		Movie_Q8 obj2 = new Movie_Q8(102, "DDLJ", 11.9f);
		Movie_Q8 obj3 = new Movie_Q8(103, "PK", 10.3f);
		Theatre_Q8 tobj = new Theatre_Q8();
		Theatre_Q8 t[] = new Theatre_Q8[3];
		t[0] = new Theatre_Q8(201, "A", obj1);
		t[1] = new Theatre_Q8(202, "B", obj2);
		t[2] = new Theatre_Q8(203, "C", obj3);
		System.out.println(Arrays.toString(t));
		tobj.printRating(t);

	}

}
