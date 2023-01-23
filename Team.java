package com.antra;

public class Team extends java.util.LinkedList {
	public void addPlayer(Player p) {
		add(p);
	}

	public void compete(Team opponent) {
		/* more code here */ }
	public static void main(String[] args) {
		Player p1=new Player();
		Team t1=new Team();
//		t1.addPlayer(p1);
		System.out.println(t1.toString());
	}
}

class Player {
	/* more code here */ 
	
	}
