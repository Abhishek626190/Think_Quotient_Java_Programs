package com.corejavaeclipsetest1;

//import java.util.Arrays;

public class FrequentCharacterQ2 {

	public void frequency(char a[]) {
		int max = 0;
		int secondMax = 0;
		char ch1 = 0;
		char ch2 = 0;

		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}
			if (count >= 0) {
				boolean isnotchecked = true;
				for (int k = i - 1; k >= 0; k--) {
					if (a[k] == a[i]) {
						isnotchecked = false;
					}
				}
				if (isnotchecked) {
					System.out.println(a[i] + " count " + (count + 1));
					 

				}
				if (count + 1 > max) {
					secondMax = max;
					max = count + 1;
					ch2 = ch1;
					ch1 = a[i];
				} else if (count + 1 > secondMax) {
					secondMax = count + 1;
					ch2 = a[i];
				}
			}

		}
		System.out.println(ch1 + " has highest frequency= " + max);
        System.out.println(ch2 + " has second highest frequency = " + secondMax);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrequentCharacterQ2 obj = new FrequentCharacterQ2();
		String str = "success";
		char ch[] = str.toCharArray();
		// System.out.println(Arrays.toString(arr));
		obj.frequency(ch);

	}

}
