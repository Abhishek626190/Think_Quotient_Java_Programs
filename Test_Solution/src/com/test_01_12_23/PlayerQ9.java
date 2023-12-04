package com.test_01_12_23;

public class PlayerQ9 {
	private int id;
	private String name,country,team;
	
	public PlayerQ9(int id, String name, String country, String team) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
		this.team = team;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String toString() {
		return "PlayerQ9 [id=" + id + ", name=" + name + ", country=" + country + ", team=" + team + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
