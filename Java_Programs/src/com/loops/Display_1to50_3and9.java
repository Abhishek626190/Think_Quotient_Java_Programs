package com.loops;

public class Display_1to50_3and9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=50;i++)
		{
			if(i%3==0&&i%9==0)
			{
				System.out.println("SKIPPED ");
				continue;
			}
			else
			{
				System.out.println(i);
			}
		}

	}

}
