package com.Test_23_Nov;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="PeterPan";
		char ch[]=str.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{  
			count=0;
			for(int j=0;j<ch.length;j++)
			{
				if(i!=j)
				{
					if(ch[i]==ch[j])
 					count++;
 				}
			}
			if(count==0) {
		      System.out.println("First non repeating character is "+ch[i]);
			  break;
			}
				
		}

	}

}
