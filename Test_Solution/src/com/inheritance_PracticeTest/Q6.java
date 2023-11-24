package com.inheritance_PracticeTest;

interface P{
	String p="PPP";
	String methodP();
}
interface Q extends P{
	String q="QQQ";
	String methodQ();
}
class R implements Q,P
{
	public String methodP()
	{
		return p+q;
	}
	public String methodQ()
	{
		return q+p;
	}
}
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		R r=new R();
		System.out.println(r.methodQ());
		System.out.println(r.methodP());

	}

}
