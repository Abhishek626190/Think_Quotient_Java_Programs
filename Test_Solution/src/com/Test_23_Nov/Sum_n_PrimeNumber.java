package com.Test_23_Nov;

import java.util.Scanner;

public class Sum_n_PrimeNumber {
	public int  checkPrime(int n) {
		int count = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				count++;
				break;
			}
		}
		if (count == 0)
			return 0;
			//System.out.println(n + " is Prime number");
		else
			return 1;
			//System.out.println(n + " is not Prime number");
	}
	public void sumPrime(int n)
	{
		int count=0;
		int sum=0;
		for(int j=2;count<n;j++)
		{
			int res=checkPrime(j);
			if(res==0)
			{
				sum=sum+j;
				count++;
			}
			
 		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter Number to check number is prime or not");
		System.out.println("Enter term");
 		int num = sc.nextInt();
		Sum_n_PrimeNumber obj = new Sum_n_PrimeNumber();
		//obj.checkPrime(num);
		obj.sumPrime(num);

	}

}
