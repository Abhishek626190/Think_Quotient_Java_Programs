package com.Print_Patterns;

public class P12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= 15; j++) {
				if (j >= 9 - i && j <= 7 + i) {
					if (i % 2 != 0 && j % 2 == 0)
						System.out.print("*");
					else if (i % 2 == 0 && j % 2 != 0)
						System.out.print("*");
					else
						System.out.print(" ");
				} else
					System.out.print(" ");
			}
			System.out.println("");
		}
		for (int k = 1; k <= 7; k++) {
			for (int l = 1; l <= 15; l++) {
				if (l >= 6 && l <= 10) {
					if (l % 2 == 0)
						System.out.print("*");
					else
						System.out.print(" ");
				} else
					System.out.print(" ");
			}
			System.out.println("");
		}

	}

}
