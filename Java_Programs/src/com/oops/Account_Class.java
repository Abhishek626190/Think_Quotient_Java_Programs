package com.oops;

public class Account_Class {
	static float interestrate;
	static {
		interestrate=8.5f;
		
	}
	public static void setIntnerest(float ir )
	{
		interestrate=ir; 
	}
	public static float getIntnerest( )
	{
		return interestrate ; 
	}
	public void display()
	{
		System.out.println(interestrate);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account_Class obj=new Account_Class();
		setIntnerest(9.8f);
		getIntnerest();
 		obj.display();

	}

}
