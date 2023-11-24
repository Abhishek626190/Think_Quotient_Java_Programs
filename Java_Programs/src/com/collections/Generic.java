package com.collections;

public class Generic<T> {
	T obj;
	Generic(T o)
	{
		this.obj=o;
	}
	T getObj()
	{
		return obj;
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generic<Integer> g=new Generic<Integer>(12);
		int i=g.getObj();
		System.out.println(i);
		Generic<String>s=new Generic<String>("Java");
		String str=s.getObj();
		System.out.println(str);
		//g=s;//Compile time error type mismatch

	}

}
