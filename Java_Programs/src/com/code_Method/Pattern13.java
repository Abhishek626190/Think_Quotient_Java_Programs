package com.code_Method;

public class Pattern13 {
	public void pattern() {
		for (int i = 1; i <= 17; i++) {
			for (int j = 1; j <= 17; j++) {
				if (i % 2 == 0) {
					System.out.print("");
				} else if (j == 10 - i || j == 8 + i)
					System.out.print("*");
				else if (i == 17)
					System.out.print("*");
				else
					System.out.print(" ");
				// not yet cmpleted
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern13 obj = new Pattern13();
		obj.pattern();

	}

}
