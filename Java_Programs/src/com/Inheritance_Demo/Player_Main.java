package com.Inheritance_Demo;
class Player
{
	Player()
	{
		System.out.println("Player Default Constructor");
	}
}
class Hockey_Player extends Player
{
	Hockey_Player()
	{
		System.out.println("Hockey_Player Default Constructor");
	}
}
class Football_Player extends Player
{
	Football_Player()
	{
		System.out.println("Football_Player Default Constructor");
	}
}
class Cricketer extends Player
{
	Cricketer()
	{
		System.out.println("Cricketer Default Constructor");
	}
}
class Batsmen extends Cricketer
{
	Batsmen()
	{
		System.out.println("Batsmen Default Constructor");
	}	
}
class Bowler extends Cricketer
{
	Bowler()
	{
		System.out.println("Bowler Default Constructor");
	}
}
 
public class Player_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player p=new Player();
		System.out.println(p);
		Hockey_Player h=new Hockey_Player();
		System.out.println(h);
		Cricketer c=new Cricketer();
		System.out.println(c);
		Batsmen bt=new Batsmen();
		System.out.println(bt);
		Bowler bl=new Bowler();
		System.out.println(bl);
		
	}

}
