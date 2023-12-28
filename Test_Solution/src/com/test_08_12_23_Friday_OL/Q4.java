package com.test_08_12_23_Friday_OL;

//import java.util.Arrays;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="my name is yasmin";
		char ch[]=str.toCharArray();
		//System.out.println(Arrays.toString(ch));
		int count=0;
		for(int i=0;i<ch.length;i++)
		{	count=0;
			for(int j=0;j<ch.length;j++)
			{
				if(i!=j)
				{
					if(ch[i]==ch[j])
					{
						count++;
					}
				}
			}
			if(count==0)
			{
				System.out.println("First Non-Repeating Character is "+ch[i]);
			}
		}

	}

}
