package com.jsp.javaprograms.oops;


public class AbstractClass {
	public static void main(String[] args) {
		A3 a=new B3();
		a.m1();
		a.m2();
		a.m3();
		((B3)a).m4();
	}

}

abstract class A3
{
	abstract  void m1();
	public void m2()
	{
		System.out.println("m2 define");
	}
	public void m3()
	{
		System.out.println("m3 define");
	}
}
class B3 extends A3
{
	@Override
	public void m1()
	{
		System.out.println("m1");
	}
	public void m4()
	{
		System.out.println("m4");
	}


}
