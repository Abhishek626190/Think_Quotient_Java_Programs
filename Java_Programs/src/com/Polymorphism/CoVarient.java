package com.Polymorphism;

public class CoVarient {
	public CoVarient c(CoVarient co)
	{
		System.out.println();
		return co;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class SubCoVarient extends CoVarient
{
	public SubCoVarient c(SubCoVarient co)
	{
		System.out.println();
		return co;
	}
}
class Sub1CoVarient extends CoVarient
{
	public SubCoVarient c(SubCoVarient co)
	{
		System.out.println();
		return co;
	}
}
