package com.aprilFinalWrittenTest2019;
/*
 * 13)Write a Java program to print the first 15 numbers of the series.[1M]
The first few terms of the sequence are :
0, 1, 2, 5, 12, 29, 70, 169, 408, 985, 2378, 5741, 13860,…

 */
public class SeriesQ13 {
	public void printSeries()
	{
		System.out.print("0,");
		int a=1;
		int b=2;
		int res=0;
		System.out.print(a+","+b+",");
		for(int i=1;i<12;i++)
		{
			res=b*2+a;
			a=b;
			b=res;
			
			System.out.print(res+",");
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeriesQ13 obj=new SeriesQ13();
		obj.printSeries();

	}

}
