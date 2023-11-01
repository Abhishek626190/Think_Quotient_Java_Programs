package com.Inheritance_Demo;

class Account
{
	Account()
	{
		System.out.println("Account Default Constructor");
	}
}
class Saving_Account extends Account
{
	Saving_Account()
	{
		System.out.println("Saving_Account Default Constructor");
	}
}
class Fixed_Deposit_Account extends Account
{
	Fixed_Deposit_Account()
	{
		System.out.println("Fixed_Deposit_Account Default Constructor");
	}
}
public class Account_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fixed_Deposit_Account fd=new Fixed_Deposit_Account();
		Saving_Account sa=new Saving_Account();
		System.out.println(fd);
		System.out.println(sa);
		

	}

}
