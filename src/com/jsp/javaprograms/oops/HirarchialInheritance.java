package com.jsp.javaprograms.oops;

public class HirarchialInheritance {

	public static void main(String[] args) {
		HirarchialChildOne childOne=new HirarchialChildOne();
		HirarchialChildTwo childTwo=new HirarchialChildTwo();
		System.out.println(childOne.i);
		System.out.println(childOne.j);
		System.out.println(childTwo.k);
		childOne.displayA();
		childTwo.displayA();
		childTwo.displayC();
	}
}
	class HirarchialParentclass{
		int i=1;
		public void displayA() {
			System.out.println("value of class parent is"+i);
		}
	}
	class HirarchialChildOne extends HirarchialParentclass{
		int j=2;
		public void displayB() {
			System.out.println("value of class Child is"+j);
		}
	}
		class HirarchialChildTwo extends HirarchialParentclass{
			int k=3;
			public void displayC() {
				System.out.println("value of class Child is"+k);
			}
		}

