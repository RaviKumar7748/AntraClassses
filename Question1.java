package com.rk.exception;

@SuppressWarnings("serial")
class ArithmeticException extends Exception {

	public ArithmeticException() {
		super();
	}

	public ArithmeticException(String message) {
		super(message);
	}

}

class Calculator {
	int a;
	int b;

	public Calculator(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int add() throws ArithmeticException {
		if (a < 0 || b < 0) {
			throw new ArithmeticException("Variable value should not be negative ");
		}

		return a + b;

	}

	public int subtract() throws ArithmeticException {
		if (a < 0 || b < 0) {
			throw new ArithmeticException("Variable value should not be negative ");
		}
		return a - b;

	}

	public int multiply() throws ArithmeticException {
		if (a < 0 || b < 0 || a == 0 || b == 0) {
			throw new ArithmeticException("Variable value should not be negative and not equal to zero ");
		}
		return a * b;

	}

	public int division() throws ArithmeticException {
		if (a < 0 || b < 0 || a == 0 || b == 0) {
			throw new ArithmeticException("Variable value should not be negative and not equal to zero ");
		}
		return a / b;

	}

}

public class Question1 {
	public static void main(String[] args) {
		
		try {
			Calculator c1 = new Calculator(12, 3);
			int add = c1.add();
			System.out.println(add);
//		int division = c1.division(0, 0);
//		System.out.println(division);
//		int multiply = c1.multiply(0, 12);
//		System.out.println(multiply);
			int add2 = c1.add();
			System.out.println(add2);
		} catch (ArithmeticException | NumberFormatException e) {
			e.printStackTrace();
		}
	}

}
