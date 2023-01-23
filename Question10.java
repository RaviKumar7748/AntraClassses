package com.rk.exception;

public class Question10 {
	void f1()
	{
	try
	{
	int a[ ]={12,35,8,46};
	System.out.println(a[6]);
	}
	catch(ArrayIndexOutOfBoundsException ae)
	{
	System.err.println(ae);
	}
	try
	{
	String s="sathya Technologies";
	System.err.println(s.charAt(15));
	}
	catch(StringIndexOutOfBoundsException se)
	{
	System.err.println(se);
	}
	}
	public static void main(String[] args) {
		Question10 obj=new Question10();
		obj.f1();
		//Index 6 out of bounds for length 4 AIOBE
//		g

		
	}

}
