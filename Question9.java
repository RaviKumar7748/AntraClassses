package com.rk.exception;

public class Question9 {
	void f1()
	{
	try
	{
	int x=10,y=8,z;
	z=x+y;
	}
	catch(Exception e)
	{
	System.err.println(e);
	}
	finally
	{
//	System.err.println(z ); we can not access try block inside our finally block
		//because for try block it will act as a local variable 
	}
	}
	public static void main(String[] args) {
		
	}

}
