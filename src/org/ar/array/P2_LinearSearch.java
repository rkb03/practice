package org.ar.array;

public class P2_LinearSearch {

	public static void main(String[] args) {

		int arr[]={5,-1,7,8,2,3};
		boolean res=ls(arr,6,0);
		System.out.println(res);	
		
		int arr1[]={-1,2,3,5,7,8};
		boolean res1=lsForSortedArray(arr1,6,4);
		System.out.println(res1);
	}
//logic for ls
	private static boolean ls(int[] arr, int n, int key) {
		for(int i=0;i<n;i++) {
			if(arr[i]==key) 
				return true;
		}
		System.out.println("Key not found");
		return false;
	}
	//logic for lsForSortedArray
	private static boolean lsForSortedArray(int[] arr1, int n, int key) {
		for(int i=0;i<n;i++) {
			if(arr1[i]==key) 
				return true;
			if(arr1[i]>key) {
				return false;
			}
		}
		System.out.println("Key not found");
		return false;
	}
}
