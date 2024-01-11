package com.aprilFinalWrittenTest2019;

/*
 * 8)suppose there are 3 bulb continually  on and  off  set
 *  the sequence where 3rd bulb on first ,then 1st bulb on 
 *  and then 2nd bulb[1M]
 */
public class BulbQ8 {

	public void onoff() {
		boolean third = true;
		boolean second = false;
		boolean first = false;
		while (true) {
			if (third) {
				System.out.println("💡💡💡");
				first = true;
				third = false;
			} else if (first) {
				System.out.println("💡");
				second = true;
				first = false;
			} else if (second) {
				System.out.println("💡💡");
				third = true;
				second = false;
			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BulbQ8 obj = new BulbQ8();
		obj.onoff();
//		int a = 3;
//		int b = 0;
//		int c = 0;

//		while (true) {
//			if (a == 3) {
//				System.out.println(a);
//				b = a - 2;
//				a = 1;
//			} else if (b == 1) {
//				System.out.println(b);
//				c = b + 1;
//				b = 2;
//			} else if (c == 2) {
//				System.out.println(c);
//				a = c + 1;
//				c = 1;
//
//			}
//
//		}

	}

}
