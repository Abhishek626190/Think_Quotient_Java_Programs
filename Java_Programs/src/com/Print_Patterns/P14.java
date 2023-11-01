package com.Print_Patterns;

public class P14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 10; i <= 19; i++) {
			for (int j = 1; j <= 19; j++) {
				if (j >= i - 9 && j <= 29 - i) {
					if (j % 2 == 0 && i % 2 != 0)
						System.out.print("*");
					else if (j % 2 != 0 && i % 2 == 0)
						System.out.print("*");
					else
						System.out.print(" ");
				} else
					System.out.print(" ");
			}
			System.out.println();
		}
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 19; j++) {
				if (j >= 11 - i && j <= 9 + i) {
					if (j % 2 == 0 && i % 2 != 0)
						System.out.print("*");
					else if (j % 2 != 0 && i % 2 == 0)
						System.out.print("*");
					else
						System.out.print(" ");
				} else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
