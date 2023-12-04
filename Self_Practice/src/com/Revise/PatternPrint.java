package com.Revise;

public class PatternPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="JAVA";
		char ch[]=str.toCharArray();
		 
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(ch[j]);
				 
			}
			System.out.println();
		}
		for(int k=str.length()-1;k>=0;k--)
		{
			for(int l=0;l<=k-1;l++)
			{
				System.out.print(ch[l]);
			}
			System.out.println();
		}

	}

}
