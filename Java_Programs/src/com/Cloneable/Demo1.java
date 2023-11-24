package com.Cloneable;

public class Demo1 {
	public static void gfg(P p)
	{
		System.out.println("p");
	}
	public static void gfg(Q q)
	{
		System.out.println("q");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gfg(null);

	}

}
class P{
	
}
class Q extends P
{
	
}
