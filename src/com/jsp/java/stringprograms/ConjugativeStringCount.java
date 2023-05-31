package com.jsp.java.stringprograms;

import java.util.Scanner;

public class ConjugativeStringCount {

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner (System.in);
		System.out.println("enter string");
		String s1 =scn.nextLine();
		String s=s1+" ";
		String output ;
		int count=1;
		int i=0;
		for(i=0;i<s.length()-1;i++)
		{
		if(s.charAt(i)==s.charAt(i+1))count ++;
		else 
		{
			output  =s.charAt(i)+""+count; 
			count =1;
			System.out.println(output);
		}
		}
		

}
}
