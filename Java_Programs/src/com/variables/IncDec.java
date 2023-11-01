package com.variables;

public class IncDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=2;
		int y=3;
		int z;
//		z=(x++)+(y++)+(++y)-x;
//		z=(--y)+(--x)+(x++)+(y++)-y;
//		z=(++x)+(++y)+(x--)-(--y)+x;
//		z=--x - --y - y-- -y - x*2;
		z=x++ + y++ - y-- - x-- - --x - --y;
		
		
		System.out.println("The result is="+z);
		System.out.println("The value of x and y is="+x+"AND"+y);
		

	}

}
;