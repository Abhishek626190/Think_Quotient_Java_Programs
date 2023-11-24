package com.collections;

public class TwoGeneric<T, E> {
	T obj1;
	E obj2;

	public TwoGeneric(T o1, E o2) {
		// TODO Auto-generated constructor stub
		this.obj1 = o1;
		this.obj2 = o2;
	}

	public T getObj1() {
		return obj1;
	}

	public void setObj1(T obj1) {
		this.obj1 = obj1;
	}

	public E getObj2() {
		return obj2;
	}

	public void setObj2(E obj2) {
		this.obj2 = obj2;
	}

	void showTypes() {
		System.out.println(obj1.getClass());
		System.out.println(obj2.getClass());
	}

	@Override
	public String toString() {
		return "TwoGeneric [obj1=" + obj1 + ", obj2=" + obj2 + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoGeneric<Integer, String> t = new TwoGeneric<Integer, String>(12, "Java");
		System.out.println(t);

	}

}
