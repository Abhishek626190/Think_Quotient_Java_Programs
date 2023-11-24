package com.Test_Assignments_06_11_2023;

public class Q7_Find_Numbers {
	public static void find() {
		for (int i = 100; i <= 400; i++) {
			int count = 0;
			int temp = i;
			for (int j = 0; temp != 0; j++) {
				int rem = temp % 10;
				if (rem % 2 == 0)
					count = count + 1;
				else
					break;
				temp = temp / 10;

			}
			if (count == 3)
				System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		find();

	}

}
