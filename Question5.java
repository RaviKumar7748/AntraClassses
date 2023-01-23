package com.rk.exception;

public class Question5 {
	void f1()
	{
	try
	{
	int x=10,y=0,z;
	int a[ ]={12,35,8,46};
	System.out.println(a[6]);
	z=x/y;
	}
	catch(Exception e)
	{
	System.err.println(e.getMessage());
	}
	}
public static void main(String[] args) {
	Question5 obj=new Question5();
	obj.f1();//Index 6 out of bounds for length 4
	
}
}
