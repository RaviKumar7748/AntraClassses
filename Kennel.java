package com.antra;

class Dog {
}

class Beagle extends Dog {
}

class Kennel {
	public static void main(String[] arfs) {
		Beagle b1 = new Beagle();
		Dog dog1 = new Dog();
		Dog dog2 = b1; 
		Beagle b2=(Beagle) dog2;
		// insert code here
	}
}
