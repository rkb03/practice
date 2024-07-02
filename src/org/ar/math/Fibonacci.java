package org.ar.math;

import java.util.Scanner;

public class Fibonacci {

	static int a=0; static int b=1; static int c;
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		printFibonaci(n);
		

	}
	private static int printFibonaci(int n) {

		if (n==0) {
			return 0;
		}if (n==1) {
			return 1;
		}else {
			System.out.print(a+" "+b+" ");
			for(int i=3;i<=n;i++) {
				 c=a+b;
				 a=b;
				 b=c;
				 System.out.print(c+" ");
			}
		return c;
		
	}}
}
