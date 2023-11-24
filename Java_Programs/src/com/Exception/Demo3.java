package com.Exception;

public class Demo3 {
	public static int show(int a) {
		int res;
		try {
			res = a / 0;
			System.out.println(res);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} finally {
			System.out.println("I am in final block");
		}
		return 10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main start");
		int num = 10;
		int res;

		try {
			show(num);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		// System.out.println();
//		finally {
//			System.out.println("I am in finally");
//		}

//		try
//		{
//			res=num/0;
//			System.out.println(res);
//		}
//		catch(ArithmeticException e)
//		{
//			e.printStackTrace();
//		}
		System.out.println("Main end");

	}

}
