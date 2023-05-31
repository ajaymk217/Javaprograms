package com.jsp.javaprograms.oops;

public class SingleLevelInheretance {
	public static void main(String[] args) {
		Child child = new Child();
		System.out.println(child.i);
		System.out.println(child.j);
		child.displayB();
	}
}
	class Parent{
		int i=1;
		public void displayA() {
			System.out.println("value of class parent is"+i);
		}
	}
	class Child extends Parent{
		int j=2;
		public void displayB() {
			System.out.println("value of class Child is"+i);
			System.out.println("value of class Child is"+j);
		}
		
	}


