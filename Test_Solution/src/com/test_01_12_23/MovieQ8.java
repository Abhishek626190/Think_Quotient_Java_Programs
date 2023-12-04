package com.test_01_12_23;

import java.util.Arrays;
import java.util.List;

public class MovieQ8 {
	private int id;
	private String name;
	private List<String>actor;
	
  	public MovieQ8(int id, String name, List<String> actor) {
		super();
		this.id = id;
		this.name = name;
		this.actor = actor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getActor() {
		return actor;
	}

	public void setActor(List<String> actor) {
		this.actor = actor;
	}

	@Override
	public String toString() {
		return "MovieQ8 [id=" + id + ", name=" + name + ", actor=" + actor + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>alist=Arrays.asList();
		alist.add("Amitabh");
		alist.add("Govinda");
		List<String>alist2=Arrays.asList();
		alist2.add("Abhishek");
		alist2.add("Salman");
		List<String>alist3=Arrays.asList();
		alist3.add("Abhishek");
		alist3.add("Amitabh");
		
		


	}

}
