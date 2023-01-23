package com.antra;

class Plant1 {
	String getName() {
		return "plant";
	}

	Plant1 getType() {
		return this;
	}
}

public class Flower extends Plant1 {
	// insert code here
//	Flower getType() {
//		return this;
//	}

//	Flower getType() {
//		return null;
//	}
//	Plant1 getType() {
//		return this;
//	}
	Tulip getType() {
		return new Tulip();
	}

	class Tulip extends Flower {
	}
}
