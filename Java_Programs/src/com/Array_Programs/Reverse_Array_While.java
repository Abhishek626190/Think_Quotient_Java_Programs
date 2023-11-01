package com.Array_Programs;

public class Reverse_Array_While {
	private int array[]=new int[5];
	public void setArray()
	{
		array[0]=100;
		array[1]=200;
		array[2]=300;
		array[3]=400;
		array[4]=500;
		System.out.println("lenght of array is:"+array.length);

		this.displayArray(array);

	}
	public void displayArray(int a[])
	{
		int i=a.length-1;
		while(i>=0)
		{
		System.out.println(a[i]);
		i--;
		}
		System.out.println("*****");
		System.out.println("lenght of array is:"+a.length);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse_Array_While obj=new Reverse_Array_While();
		obj.setArray();

	}

}
