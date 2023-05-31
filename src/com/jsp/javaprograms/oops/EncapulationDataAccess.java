package com.jsp.javaprograms.oops;

public class EncapulationDataAccess {
	public static void main(String[] args) {
		EncapulatedData ab = new EncapulatedData();
		ab.setA(10);
		ab.setC('A');
		ab.setS("setter");
		System.out.println(ab.getA());
		System.out.println(ab.getC());
		System.out.println(ab.getS());
	}
}