package com.Inheritance_Demo;

class Ipl_Team {
	Ipl_Team() {

	}

	public void play() {
		System.out.println("IPL_Team");
	}

}

class Csk extends Ipl_Team {
	Csk() {

	}
}

class Rcb extends Ipl_Team {
	Rcb() {

	}
}

public class IplTeam_Q5_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ipl_Team ipl = new Ipl_Team();
		Csk c = new Csk();
		Rcb r = new Rcb();
		r.play();
		c.play();
	}

}
