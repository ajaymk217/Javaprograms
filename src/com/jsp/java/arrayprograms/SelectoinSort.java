package com.jsp.java.arrayprograms;

public class SelectoinSort {

	public static void main(String[] args) {

		int [] a= {2,3,5,7,9,4,1};
		sort(a);
		for(int i:a) {
			System.out.println(i);
	}

}

	private static void sort(int[] a) {

		for(int i=0;i<a.length;i++) {
			int index=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j] < a[index]) index=i;
			}
			if(i!=index) {
				int temp=a[i];
				a[i]=a[index];
				a[index]=temp;
			}
		}
	}
}
