package com.jsp.java.stringprograms;

import java.util.Scanner;
import java.util.Stack;

public class BracketBalance {
	public static void main(String[] args)
	{
		
		for(;;)
		{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter string to check balance");
		String s =scn.next();
		System.out.println(isBracket(s));
		}
	}
		public static boolean isBracket(String s)
		
		{	
			Stack<Character>  stack= new Stack<Character>();
			for(int i=0;i<=s.length()-1;i++)
			{
				char c1=s.charAt(i);
				if(c1== '{'|| c1=='('||c1=='[')
				{
					stack.push(c1);
				}
				else if(c1=='}'||c1==')'||c1==']')
				{
					if(stack.isEmpty()) return false;
					char c2=stack.pop();
					if(!isPair(c2,c1)) return false;
				}
			}
			if(stack.isEmpty()) return true;
			return false;
			
		}
		public static boolean isPair(char c1,char c2)
		{
			if(c1=='{' && c2=='}') return true;
			if(c1=='[' && c2==']') return true;
			if(c1=='(' && c2==')') return true;
			return false;
		}
}
