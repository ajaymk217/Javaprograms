package com.jsp.java.stringprograms;

public class PosiblePallendromInString {
	public static void main(String[] args) {
		String s="malayalam";
		for(int i=0;i<=s.length();i++) {
			for(int j=i+2;j<=s.length();j++) {
				
				String s1=s.substring(i, j);
				if(isPallendrome(s1)) System.out.println(s1);
		}
	}
}

	private static boolean isPallendrome(String s) {

		char[] cs = s.toLowerCase().toCharArray();
		int i=0;int j=cs.length-1;
		while(i<j) {
			if(cs[i]!=cs[j]) return false;
			i++;
			j--;
	}
		return true;
	}
}
