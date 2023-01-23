package com.rk.exception;

public class Question8 {
	void f1()
	{
	try
	{
	String s="sathya Technologies";
	System.err.println(s.charAt(15));
	}
	catch(Exception e)
	{
	System.err.println(e);
	}
//	catch(StringIndexOutOfBoundsException se)
//	{ first child class Exception comes then super class Exception comes in try with multi catch
//	System.err.println(se);
//	}
	}
	public static void main(String[] args) {
		
	}

}
