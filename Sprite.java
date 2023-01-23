package com.antra;

interface Foo {
	int bar();
}

public class Sprite {
	public int fubar(Foo foo) {
		return foo.bar();
	}

	public void testFoo() {
//		fubar(new class Foo { public int bar() { return 1; });
		// insert code here
		
	}
}
