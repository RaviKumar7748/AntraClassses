package com.antra;

class MyException extends Exception {
	String str;

	public MyException() {
	}

	public MyException(String str) {
		super(str);
		this.str = str;
	}
}

public class MainMethod {
	public static void main(String[] args) throws MyException {
		String input = args[0];
		if (input.length() < 11) {
			throw new MyException("String Length must be more than 11 ");
		}

	}
}
