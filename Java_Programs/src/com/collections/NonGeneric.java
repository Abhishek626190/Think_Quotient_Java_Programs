package com.collections;

public class NonGeneric {
	Object obj;

	public NonGeneric() {
		// TODO Auto-generated constructor stub
	}

	NonGeneric(Object o) {
		this.obj = o;
	}

	void showType() {
		System.out.println(obj.getClass());
	}

	Object getObj() {
		return obj;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonGeneric obj = new NonGeneric(12);
		obj.showType();
		// System.out.println(obj.getClass());
		int i = (int) obj.getObj();
		System.out.println(i);

		NonGeneric obj1 = new NonGeneric("Java");
		obj1.showType();
		// System.out.println(obj.getClass());
		String s = (String) obj1.getObj();// Every time while getting the value we need t do type casting//
		System.out.println(s);
		obj = obj1;
		System.out.println(obj);
//		int v = (int) obj.getObj();//Type mismatch error
//		System.out.println(v);

	}

}
