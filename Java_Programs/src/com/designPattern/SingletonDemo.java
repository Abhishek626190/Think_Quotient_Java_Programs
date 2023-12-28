package com.designPattern;

public class SingletonDemo {
	private static SingletonDemo singleton_instance;
	  String s;
 	private SingletonDemo()
	{
		s="Hello i am a string part of singleton class";
		System.out.println(s);
	}
	public  static SingletonDemo  getInstance()
	{
		if(singleton_instance==null)
			singleton_instance=new SingletonDemo();
		return singleton_instance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//singletonDemo();
		SingletonDemo obj=new SingletonDemo();
		System.out.println(obj);
		SingletonDemo obj1=new SingletonDemo();
		System.out.println(obj1);

	}

}
