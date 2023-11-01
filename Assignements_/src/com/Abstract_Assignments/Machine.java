package com.Abstract_Assignments;

public abstract class Machine {
	public void rotate()
	{
		System.out.println("Rotate method in Machine class");
	}
	public abstract void crush();
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Juicer j=new Juicer();
		j.crush();
		j.filter();
		j.rotate();
		Machine m=new Juicer();
		m.crush();
		m.rotate();
		Mixer mi=new Mixer();
		mi.crush();
		m.rotate();
		mi.blend();
		
		

	}

}
class Juicer extends Machine
{
	public void crush()
	{
		System.out.println("Crush method in Juicer Class");
	}
	public void filter()
	{
		System.out.println("Filter method in Juicer Class");
	}
}
class Mixer extends Machine
{
	public void crush()
	{
		System.out.println("Crush method in Mixer class");
	}
	public void blend()
	{
		System.out.println("Blend Method in Mixer Class");
	}
}
