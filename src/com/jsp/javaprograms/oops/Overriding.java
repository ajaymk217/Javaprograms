package com.jsp.javaprograms.oops;


public class Overriding {


	public static void main(String[] args) {
		A2 a=new A2();
		a.m1();
	}

}
class A2
{
	   void m1()
	{
		System.out.println("m1() Defined");
	}
}
class B2 extends A2
{
	@Override
	  void m1()
	{
	System.out.println("m1() of b2 Defined");

	}
}
