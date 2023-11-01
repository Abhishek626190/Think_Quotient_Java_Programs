package com.oops;

public class MethodOverLoadingDemo {
	public void add(int i,int j)
	{
		int sum=i+j;
		System.out.println(sum);
	}
//	public void add(int i,int j)
//	{
//		This is a error beacuse the method signature is same
//	}
//	private void add(float k,float l)//This is methodOverloading
//	{
//		float sum=k+l;
//		System.out.println(sum);
//	we can take differnet access specifiers with the same name but differnet parameters
//	}
	public void add(float k,float l)//This is methodOverloading
	{
		float sum=k+l;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverLoadingDemo obj=new MethodOverLoadingDemo();
		obj.add(10, 20);
		obj.add(10f, 20f);
		
	}

}
