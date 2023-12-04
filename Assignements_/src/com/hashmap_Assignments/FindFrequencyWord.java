package com.hashmap_Assignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class FindFrequencyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hassena Hassena Tu Mereko Dekh Ke Hassena";
		String s[]=str.split(" ");
		HashMap<String,Integer>strmap=new HashMap<>();
		for(int i=0;i<s.length;i++)
		{
			if(strmap.containsKey(s[i]))
			{
				int v=strmap.get(s[i]);
				strmap.put(s[i],v+1);
			}
			else
				strmap.put(s[i],1);
		}
		Set<Entry<String,Integer>>setmap=strmap.entrySet();
		Iterator<Entry<String,Integer>>stritr=setmap.iterator();
		while(stritr.hasNext()) {
			Entry<String,Integer>s1=stritr.next();
			System.out.println(s1.getKey()+" "+s1.getValue());
		}
	}

}
