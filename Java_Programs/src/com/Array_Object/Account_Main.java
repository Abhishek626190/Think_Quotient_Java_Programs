package com.Array_Object;

public class Account_Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account arr[]=new Account[5];
		arr[0]= new Account("Abhishek",546139887,54697.5);
		arr[1]= new Account("Abhi",546139888,54459.5);
		arr[2]= new Account("Abhinash",546139889,46597.5);
		arr[3]= new Account("Abhinav",546139890,14550.5);
		arr[4]= new Account("Abhilasha",546139891,78497.5);
		 
		 
		for(Account a:arr)
			{
			System.out.println(a);
			System.out.println("**************");
			}

		

	}

}
