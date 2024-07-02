package org.ar.array;

import java.util.Scanner;

public class P3_UniqueElementOfAnArray {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//Size of array
		
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			int x=sc.nextInt();
			ar[i]=x;				
		}
		
		for(int i=0;i<n;i++) {
			int key=ar[i];
			int count=0;
			for(int j=0;j<n;j++) {
				if(ar[j]==key) 
					count++;
				}
				if(count==1) {
					System.out.println(key);
				}
			}
		}
		
		
	}


