package com.jsp.javaprograms.oops;

import java.util.Scanner;

public class Ac {
	
	public static void main(String[] args) {
		{
			Scanner scn=new Scanner(System.in);
			System.out.println("enter tempratur");
			int s1=scn.nextInt();
			control a1=new control();
			control a2=new control();
			a1.initialTempratur();
			
			a1.display();
			a1.cnange(s1);
			a1.display();
			
		}

	}
}
class control
{
	int tempratur;
	
	 public void initialTempratur()
	 {
		 tempratur=24;
	 }
	 
	 public void cnange(int a)
	 {
		 tempratur=a;
		 
	 }
	 public void display()
	 {
		 System.out.println(tempratur+" ");
	 }
	 
	 
}
