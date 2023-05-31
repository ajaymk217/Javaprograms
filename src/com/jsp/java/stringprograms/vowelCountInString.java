package com.jsp.java.stringprograms;

import java.util.Scanner;

public class vowelCountInString {
	public static void main(String[] args)
	{
		for(;;) {
		Scanner scn =new Scanner(System.in);
		System.out.println("enter word");
		String s= scn.nextLine();
		char[]a =s.toLowerCase().toCharArray();
		
		int count =0;
		for (char c: a)
		{
			switch(c) 
			{
			case'a':
			case'e':
			case'i':
			case'o':
			case'u':
				count++;
			}
		}
		System.out.println(count++);

		}
}
}
