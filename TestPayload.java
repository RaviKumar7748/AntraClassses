package com.antra;

class Payload {
	private int weight;

	public Payload(int wt) {
		weight = wt;
	}

	public void setWeight(int w) {
		weight = w;
	}

	public String toString()
	{
		return Integer.toString(weight);
	}
}

public class TestPayload {
	static void changePayload(Payload p) {
		/* insert code here */
//		p.setWeight(420);//2
//		p.changePayload(420);
//		p = new Payload(420);
//		Payload.setWeight(420);
//		p = Payload.setWeight(420);
//		p = new Payload();
		p.setWeight(420);//1
	}

	public static void main(String[] args) {
		 Payload p = new Payload(420);
		 p.setWeight(1024);
		 changePayload(p);
		 System.out.println("The value of p is "+ p);
		 }
}


