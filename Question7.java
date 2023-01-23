package com.rk.exception;

public class Question7 {
	void f1()
	{
	try
	{
	String s="sathya Technologies";
	System.err.println(s.charAt(15));
	}
	catch(ArrayIndexOutOfBoundsException ae)
	{
	System.err.println(ae);
	}
	catch(StringIndexOutOfBoundsException se)
	{
	System.err.println(se.toString());
	}}
	public static void main(String[] args) {
		Question7 obj=new Question7();
		obj.f1();//g will be printed
		
	}

}
