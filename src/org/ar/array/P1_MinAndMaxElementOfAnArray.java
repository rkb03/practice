package org.ar.array;

public class P1_MinAndMaxElementOfAnArray {

	public static void main(String[] args) {
		int b=20;
		int a=10;
		int c=30;
		int arr[]= {-5,-7,-1,-2,-3};
		
		int max=findMax(arr,5);
	}

	public static int findMax(int[] ar,int n) {
		
		int max=ar[0];
		int min=0;
		for(int i=0;i<ar.length;i++) {
			if(max<ar[i]) {
				max=ar[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
		return max;	
	
	}
}
