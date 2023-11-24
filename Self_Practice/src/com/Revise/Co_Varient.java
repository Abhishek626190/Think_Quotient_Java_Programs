package com.Revise;

public class Co_Varient {
	public Co_Varient m1(Co_Varient c)
	{
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Sub_CO_Varient extends Co_Varient
{
	public Sub_CO_Varient m1(Sub_CO_Varient c)
	{
		return c;
	}
}
