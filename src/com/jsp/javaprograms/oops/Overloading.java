package com.jsp.javaprograms.oops;

public class Overloading {
	
	public void m1(int a) {
		System.out.println("its single parameter");
	}
	public void m1(int a,int b) {
		System.out.println("its double parameter based on length");
	}
	public void m1(int a,String s) {
		System.out.println("its double parameter based on type");
	}
	public static void main(String[] args) {
		Overloading overloading = new Overloading();
		overloading.m1(1);
		overloading.m1(1,2);
		overloading.m1(1,"a");
	}
}
