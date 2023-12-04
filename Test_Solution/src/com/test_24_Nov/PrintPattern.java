package com.test_24_Nov;

public class PrintPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="JAVA";
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(i<str.length())
				   System.out.print(ch[j]);
				if(i>=str.length()&&j<str.length()-i)
					System.out.print(ch[j]);
			}
			System.out.println();
		}

	}

}
