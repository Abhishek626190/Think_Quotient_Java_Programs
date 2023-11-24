package com.Test_Questions;

import com.inheritance_PracticeTest.Application_Q4;

public class Mobile_Application extends Application_Q4 {
	public Mobile_Application() {
		// TODO Auto-generated constructor stub
	}
	public Mobile_Application(float ver,String tech)
	{
		super(ver,tech);
	}
	public void createSetUp() {
		System.out.println("SetUp Creation Succesfully for Mobile Application");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile_Application m=new Mobile_Application(11.5f,"Flutter");
		System.out.println(m);
		m.createSetUp();
		

	}

}
