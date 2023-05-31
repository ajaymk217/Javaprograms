package com.jsp.java.arrayprograms;

public class MergeSort {

	public static void main(String[] args) {

		int [] a= {2,3,5,7,9,4,1};
		sort(a);
		for(int i:a) {
			System.out.println(i);
	}

}

	private static void sort(int[] a) {

		if(a.length==1) return;
			int [] l= new int[a.length/2];
			int [] r= new int[a.length-l.length];
			int i=0;
			while(i<l.length) {
				l[i]=a[i];
				i++;
			}
			int j=0;
			while(j<r.length) {
				r[j]=a[i];
				i++;
				j++;
			}
			sort(l);
			sort(r);
			merge(l,r,a);
			
			
		}

	private static void merge(int[] l, int[] r, int[] a) {

		int i=0,j=0,k=0;
		while(i<l.length && j<r.length) {
			if(l[i]<r[j]) a[k++]=l[i++];
			
			else a[i++]=r[j++];
		}
			while(i<l.length)a[k++] =l[i++];
			while(i<r.length)a[k++] =r[j++];
			
			
		
	}
}
