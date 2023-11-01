package com.patterns_series;

public class Display_Pattern_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 1;
		for (int i = 1; i <= 9; i++) {
			System.out.print("*");
			for (int j = 1; j <= 9; j++) {
 				if (j >= 1 && j <= k) {
 					System.out.print(j);
 					if(j==k)
 						System.out.print("*");
 				}
 				else
					System.out.print(" ");
 			}//not yet completed
 			System.out.println("");
 			if (i >= 5)
				k = k - 2;
			else
				k = k + 2;
			 
		}

	}

}
