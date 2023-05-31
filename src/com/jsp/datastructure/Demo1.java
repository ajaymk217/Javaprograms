package com.jsp.datastructure;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		ArrayList l=new ArrayList ();
		System.out.println("size="+l.size());
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		System.out.println("size="+l.size());
		Scanner scn=new Scanner (System.in);
		System.out.println("enter element to add to the arraylist");
		int i0=scn.nextInt();
		l.add(i0);
		System.out.println("enter index and element to add to the arraylist");
		int i1=scn.nextInt();
		int i2=scn.nextInt();
		l.add(i1,i2);
		System.out.println("enter index to pic");
		int a=scn.nextInt();
		int i=(Integer)l.get(a);
		System.out.println(i);
		System.out.println("enter index to remove");
		int b=scn.nextInt();
		l.remove(b);
		System.out.println("size="+l.size());
		System.out.println(l);

	}
}
