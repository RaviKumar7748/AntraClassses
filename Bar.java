package com.antra;

class Foo1 {
	public int a;

	public Foo1() {
		a = 3;
	}

	public void addFive() {
		a =a+ 5;
	}
}

public class Bar extends Foo1 {
	public int a;

	public Bar() {
		a = 8;
	}

	public void addFive() {
		a =a+ 5;
	}

	public static void main(String[] args) {

		Foo1 foo = new Bar();
		foo.addFive();
		Bar b1=new Bar();
		Foo1 f1=new Foo1();
		f1.addFive();
		System.out.println("--------------");
		System.out.println(f1.a);
		System.out.println("===============");
		System.out.println("Value: " + foo.a+"  ");
		System.out.println("Value: " + b1.a);
	}
}
