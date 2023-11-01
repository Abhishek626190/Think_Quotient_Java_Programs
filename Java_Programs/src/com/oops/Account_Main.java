package com.oops;

public class Account_Main {
	static {
		System.out.println("I am in account main static");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account_Main obj =new Account_Main();
		Account_Class obj1=new Account_Class();
		Account_Class.setIntnerest(9.5f);
		Account_Class.getIntnerest();
   		obj1.display();
  		
	

	}

}
