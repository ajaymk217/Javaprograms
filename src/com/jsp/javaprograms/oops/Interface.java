package com.jsp.javaprograms.oops;

public interface Interface {
	public void add();
	public void substarct();
	public void multplication();
	
	class InterfaceImplementation implements Interface{

		public static void main(String[] args) {
			InterfaceImplementation interfaceImplementation = new InterfaceImplementation();
			interfaceImplementation.add();
			interfaceImplementation.substarct();
			interfaceImplementation.multplication();
		}
		@Override
		public void add() {
			int i=0,j=2,l=3;
			i=j+l;
			System.out.println("the sum of i&l="+i);
			
		}

		@Override
		public void substarct() {
			int i=0,j=2,l=3;
			i=j-l;
			System.out.println("the substarct of i&l="+i);
		}

		@Override
		public void multplication() {
			int i=0,j=2,l=3;
			i=j*l;
			System.out.println("the multplication of i&l="+i);
			
		}
		
	}

}
