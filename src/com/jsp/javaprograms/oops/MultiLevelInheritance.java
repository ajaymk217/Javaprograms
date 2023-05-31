package com.jsp.javaprograms.oops;

public class MultiLevelInheritance {
	public static void main(String[] args) {
		ChildTwo child=new ChildTwo();
		System.out.println(child.i);
		System.out.println(child.j);
		System.out.println(child.k);
		child.displayA();
		child.displayB();
		child.displayC();
	}
}
	class Parentclass{
		int i=1;
		public void displayA() {
			System.out.println("value of class parent is"+i);
		}
	}
	class ChildOne extends Parent{
		int j=2;
		public void displayB() {
			System.out.println("value of class Child is"+j);
		}
	}
		class ChildTwo extends ChildOne{
			int k=3;
			public void displayC() {
				System.out.println("value of class Child is"+i);
				System.out.println("value of class Child is"+j);
				System.out.println("value of class Child is"+k);
			}
		}


