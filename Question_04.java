package com.rk.exception;

public class Question_04 {
	static void f1()
	{
	try
	{
	int x=10,y=0,z;
	z=x/y;
	}
	catch(Exception e)
	{
	e.printStackTrace();
	}
	}
public static void main(String[] args) {
	f1();//ArithmeticException: / by zero
	
}
}
