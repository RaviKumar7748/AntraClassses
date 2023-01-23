package com.antra;

class Programmer {
	Programmer debug() {
		return this;
	}
}

class SCJP extends Programmer {
	// insert code here
	Programmer debug() { return this; }
//	int debug() { return 1; }
	 int debug(int x) { return 1; }
//	 Object debug(int x) { return this; }
}
