package com.rk.exception;

@SuppressWarnings("serial")
class MyException extends Exception {

	public MyException() {
		super();
	}

	public MyException(String message) {
		System.out.println(message);
	}

}

public class Product {

	void productCheck(int weight) throws MyException {
		if (weight < 100) {
			throw new MyException("Product is Invalid ");
		} else {

			System.out.println("The weight the product is " + weight);
		}
	}

	public static void main(String[] args) {
		Product p1 = new Product();

		try {
			p1.productCheck(1000);
		} catch (MyException e) {
			e.printStackTrace();
		}
	}
}
