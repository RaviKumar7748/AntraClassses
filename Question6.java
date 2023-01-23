package com.rk.exception;

public class Question6 {
	void f1()
	{
	try
	{
	int x=10,y=2,z;//y=0,2
	z=x/y;
	}
	finally
	{
	System.err.println("hello");
	}
	}
	public static void main(String[] args) {
		Question6 obj=new Question6();
		obj.f1();//hello Arithmetic Exception
		//if y=2 hello will be printed
		
		
	}

}
