package com.jsp.javaprograms.oops;


public class Accessmodifier {
	
	public static void main(String[] args) {
		B b=new B();
		b.m2();
	}
	
}
class A
{
	private int i=12;
	  void m1()
	{
		System.out.println(i);
		
	}
}
class B extends A
{	
	public void m2()
	{
		System.out.println("asdf");
	 m1();
	}

}
